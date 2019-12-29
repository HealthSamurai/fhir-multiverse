(ns multiverse.fhir
  (:require [clojure.java.io :as io]
            [ironhide.core :as ih]
            [clojure.string :as str]))


(defn load-version [v]
  (let [fhir-version (str "fhir-" v)]
    (read-string (slurp (io/resource (str fhir-version ".edn"))))))

(defn write-to-file [filename data]
  (spit (str filename) data))

(def r4 (load-version "4.0.0"))
(def r3 (load-version "3.0.1"))

(defn get-resources [fhir]
  (->>
   (get-in fhir [:resources :Entity])
   (filter #(= "resource" (get-in % [1 :type])))
   keys
   set))

(defn get-types [fhir]
  (->>
   (get-in fhir [:resources :Entity])
   (filter #(= "type" (get-in % [1 :type])))
   keys
   set))

(defn get-primitives [fhir]
  (->>
   (get-in fhir [:resources :Entity])
   (filter #(= "primitive" (get-in % [1 :type])))
   keys
   set))

(defn get-resource-fields [fhir r]
  (->>
   fhir
   :resources
   :Attribute
   (filter #(str/starts-with? (str (first %)) (str r ".")))
   (map first)
   set))

(defn fm-diff [s1 s2]
  (->
   (clojure.set/difference s1 s2)
   sort))

(defn fm-intersect [s1 s2]
  (->
   (clojure.set/intersection s1 s2)
   sort))

(defn rfn [acc r]
  (let [r3-fields (get-resource-fields r3 r)
        r4-fields (get-resource-fields r4 r)
        added     (fm-diff r4-fields r3-fields)
        deleted   (fm-diff r3-fields r4-fields)
        shared    (fm-intersect r3-fields r4-fields)]
    (assoc
     acc
     r
     {:added   {:count  (count added)
                :fields added}
      :deleted {:count  (count deleted)
                :fields deleted}
      :shared  {:count  (count shared)
                :fields shared}})))

(defn get-resources-diff [get-resources key]
  (let [r3-resources      (get-resources r3)
        r4-resources      (get-resources r4)
        added-resources   (fm-diff r4-resources r3-resources)
        deleted-resources (fm-diff r3-resources r4-resources)
        shared-resources  (fm-intersect r3-resources r4-resources)
        fields            (when-not (= :primitive key)
                            {:fields (reduce rfn {} shared-resources)})]
    (merge
     {:added   {:count (count added-resources)
                key    added-resources}
      :deleted {:count (count deleted-resources)
                key    deleted-resources}
      :shared  {:count (count shared-resources)
                key    shared-resources}}
     fields)
    ))

(def diff
  (let [resources  (get-resources-diff get-resources :resources)
        types      (get-resources-diff get-types :types)
        primitives (get-resources-diff get-primitives :primitives)]
    {:resources  resources
     :types      types
     :primitives primitives}))

(defn get-attribute [key]
  (->
   r4
   :resources
   :Attribute
   key))
(do
  (defn keyword->path [k]
    (let [[resource & fields] (str/split (name k) #"\.")]

      (->
       (reduce (fn [acc v]
                 (let [new-prefix (str (:prefix acc) "." v)
                       attr       (get-attribute (keyword new-prefix))]
                   (->
                    (update-in acc [:path] concat [(keyword v)] (when (:isCollection attr) [[:*]]))
                    (assoc-in [:prefix] new-prefix))))
               {:path   []
                :prefix resource}
               fields)
       :path)))

  (keyword->path :Claim.careTeam.id))

(defn identity-rule [path]
  {:r3 path
   :r4 path})

(defn identity-by-key [key]
  (->
   key
   keyword->path
   identity-rule))

(do
  (def get-base-converter ;; Generated from site
    {:Claim
     #:ih {:sights
           #:ihs {:translate-use
                  {"complete"    "claim"
                   "proposed"    "preauthorization"
                   "exploratory" "predetermination"}}
           :rules [{:r3 [:use :ihs/translate-use]
                    :r4 [:use]}
                   {:r3 [:organization]
                    :r4 [:provider]}
                   {:r3 [:information]
                    :r4 [:supportingInfo]}
                   ]}})

  (defn get-copy-rules-by-resource [resource]
    (let [shared-fields (get-in diff [:resources :fields resource :shared :fields])
          copy-rules    (->>
                         (map #(concat [%] [(get-attribute %)]) shared-fields)
                         (filter #(-> % second :type))
                         (map first)
                         (map identity-by-key))]
      copy-rules))

  (defn get-converter-by-resource [resource]
    (let [base-converter (get-base-converter resource)]
      #:ih{:direction [:r3 :r4]
           :sights    (:ih/sights base-converter)
           :rules     (concat
                       (get-copy-rules-by-resource resource)
                       (:ih/rules base-converter))})
    ))

;; (get-converter-by-resource :Claim)
;; (->
;;  #:ih{:direction [:r3 :r4]
;;       :sights #:ihs {:translate {:b "str"}}
;;       :rules [{:r3 [:a :ihs/translate]
;;                :r4 [:o]}]
;;       :data {:r3 {:a :f}
;;              :r4 {:o "sr"}}}
;;  (assoc :ih/direction [:r4 :r3])
;;  ih/execute
;;  :ih/data)



(do
  (defn generate-sights [resources]
    (reduce (fn [acc k] (assoc acc (keyword (str "ihs/" (name k)))
                             (get-converter-by-resource k)))
            {}
            resources))

  (defn generate-rules [resources]
    (reduce (fn [acc k]
              (concat acc [{:r3 [k [:*] (keyword (str "ihs/" (name k)))]
                            :r4 [k [:*]]}]))
            []
            resources)
    )
  (def resources-to-convert [:Claim :MedicationRequest :Medication])
  (def super-converter
    #:ih{:direction [:r3 :r4]
         :sights    (generate-sights resources-to-convert)
         :rules     (concat (generate-rules resources-to-convert)
                            [])}))


(spit
 "results/diff.edn"
 (with-out-str
   (clojure.pprint/pprint diff)))

(spit
 "results/converter.edn"
 (with-out-str
   (clojure.pprint/pprint super-converter)))

;; [:Claim [:*]]

(def different-objects
  [:Patient :HumanName :decimal])

(->
 diff
 :resources
 :fields
 :QuestionnaireResponse
 :shared
 :fields
 clojure.pprint/pprint)
;;Resource.field.field.field



(get-attribute :Claim.payee)
(comment


  (def r4 (load-version "4.0.0"))
  (def r3 (load-version "3.3.0"))

  (def r4-res
    (into #{} (keys (get-in r4 [:resources :Entity]))))

  (def r3-res
    (into #{} (keys (get-in r3 [:resources :Entity]))))

  {:deleted (clojure.set/difference r3-res r4-res)
   :added  (clojure.set/difference r4-res r3-res)
   :stable (clojure.set/intersection r3-res r4-res)}



  )
