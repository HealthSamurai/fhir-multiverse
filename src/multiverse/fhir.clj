(ns multiverse.fhir
  (:require [clojure.java.io :as io]
            [cheshire.core :as json]
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

;; (clojure.pprint/pprint
;;  (get-resource-fields r4 :MedicationRequest))

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

(def r3-medication
  (-> (slurp "results/mapping_example/MedicationR3_package_content.json")
      (json/parse-string true)
      ))

(def r4-medication
  (-> (slurp "results/mapping_example/MedicationR4_package_content.json")
      (json/parse-string true)
      ))

(defn read-example [file]
  (-> (slurp (str "results/testdata/" file))
      (json/parse-string true)))



(do
  (defn get-item-attrs [prefix item]
    (let [item-type (->>
                     item
                     keys
                     (filter #(str/starts-with? (str %) prefix))
                     first)]
      (assoc item :item-type item-type)))

  (defmethod ih/get-global-sight :ihs/add-item-attrs [key args & [ctx]]
    (let [prefix (get args :prefix ":item")]
        [(fn [items]
           (let [res
                 (mapv (partial get-item-attrs prefix) items)]
             res)
           )
         (fn [items]
           (mapv #(dissoc % :item-type) items))]))

  (defn get-item-attrs2 [prefix item]
    (let [item-type (->>
                     item
                     :extension
                     (map keys)
                     flatten
                     (filter #(str/starts-with? (str %) prefix))
                     first)]
      (assoc item :item-type item-type)))

  (defmethod ih/get-global-sight :ihs/add-item-attrs2 [key args & [ctx]]
    (let [prefix (get args :prefix ":item")]
        [(fn [items]
           (let [res
                 (mapv (partial get-item-attrs2 prefix) items)]
             res))
         (fn [items]
           (println "attrs2" items)
           (mapv #(dissoc % :item-type) items)
           )]))

  (def get-base-converter ;; Generated from site
    {:Claim
     #:ih {:sights
           #:ihs {:translate-use
                  {"complete"    "claim"
                   "proposed"    "preauthorization"
                   "exploratory" "predetermination"}}
           :rules [{:r3 [:resourceType]
                    :r4 [:resourceType]}
                   {:r3 [:use :ihs/translate-use]
                    :r4 [:use]}
                   {:r3 [:organization]
                    :r4 [:provider]}
                   {:r3 [:information]
                    :r4 [:supportingInfo]}
                   {:r3 [:item [:*] :careTeamLinkId]
                    :r4 [:item [:*] :careTeamSequence]}
                   {:r3 [:item [:*] :diagnosisLink]
                    :r4 [:item [:*] :diagnosisSequence]}
                   {:r3 [:item [:*] :procedureLinkId]
                    :r4 [:item [:*] :procedureSequence]}
                   {:r3 [:item [:*] :infromationLinkId]
                    :r4 [:item [:*] :infromationSequence]}
                   {:r3 [:item [:*] :service]
                    :r4 [:item [:*] :productOrService]}
                   {:r3 [:item [:*] :detail :service]
                    :r4 [:item [:*] :detail :productOrService]}
                   {:r3 [:item [:*] :detail :subDetail :service]
                    :r4 [:item [:*] :detail :subDetail :productOrService]}]}
     :MedicationRequest
     #:ih {:sights #:ihs {}
           :rules  [{:r3 [:resourceType]
                     :r4 [:resourceType]}
                    {:r3 [:definition]
                     :r4 [:intstantiatesCanonical]}
                    {:r3 [:context]
                     :r4 [:encounter]}
                    {:r3 [:agent]
                     :r4 [:requester]}]}
     :Medication
     #:ih {
           :sights
           #:ihs{:item<->extension
                 #:ih{:direction [:r3 :r4]
                      :rules     []}}
           :rules [{:r3 [:resourceType]
                    :r4 [:resourceType]}
                   {:r3 [:ingredient [:*] :amount]
                    :r4 [:ingredient [:*] :strength]}
                   {:r3 [:package :content ;;:ihs/add-item-attrs
                         [:* {:itemCodeableConcept {}}]
                         :itemCodeableConcept]
                    :r4 [:extension ;; {:ih/sight :ihs/add-item-attrs2 :prefix ":value"}
                         [:* {:url "http://hl7.org/fhir/3.0/StructureDefinition/extension-Medication.package.content" :extension [{:valueCodeableConcept {} :url "item"}]}]
                         :extension
                         [0 {:url "item"}] :valueCodeableConcept]}
                   {:r3 [:package :content ;;:ihs/add-item-attrs
                         [:* {:itemReference {}}]
                         :itemReference]
                    :r4 [:extension
                         ;; {:ih/sight :ihs/add-item-attrs2 :prefix ":value"}
                         [:* {:url       "http://hl7.org/fhir/3.0/StructureDefinition/extension-Medication.package.content"
                              :extension [{:url "item" :valueReference {}}]
                              }]
                         :extension
                         [0 {:url "item"}] :valueReference]}

                   {:r3 [:package :content
                         [:*]
                         :amount]
                    :r4 [:extension
                         [:* {:url "http://hl7.org/fhir/3.0/StructureDefinition/extension-Medication.package.content"}]
                         :extension [0 {:url "amount"}] :valueQuantity]}
                   ]}
     })

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
                       (:ih/rules base-converter))}))
  ;; (->
  ;;  (get-converter-by-resource :Medication)
  ;;  (assoc-in [:ih/data :r4] r4-medication)
  ;;  (assoc-in [:ih/direction] [:r4 :r3])
  ;;  ih/execute
  ;;  :ih/data
  ;;  clojure.pprint/pprint)
  )

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


(do
  (def test-db
    {:r3
     {:Claim             [(read-example "simple_claim_r3.json")]
      :Medication        [(read-example "simple_medication_r3.json")]
      :MedicationRequest [(read-example "simple_medicationrequest_r3.json")]}

     :r4
     {:Claim             [(read-example "simple_claim_r4.json")]
      :Medication        [(read-example "simple_medication_r4.json")]
      :MedicationRequest [(read-example "simple_medicationrequest_r4.json")]}}
    )
    (spit "results/r4->r3.edn"
          (with-out-str
            (-> {:ih/data (dissoc test-db :r3)}
                (merge super-converter)
                (assoc :ih/direction [:r4 :r3])
                ih/execute
                :ih/data
                clojure.pprint/pprint))))

(do
  (def test-db
    {:r3
     {:Claim             [(read-example "simple_claim_r3.json")]
      :Medication        [(read-example "simple_medication_r3.json")]
      :MedicationRequest [(read-example "simple_medicationrequest_r3.json")]}

     :r4
     {:Claim             [(read-example "simple_claim_r4.json")]
      :Medication        [(read-example "simple_medication_r4.json")]
      :MedicationRequest [(read-example "simple_medicationrequest_r4.json")]}}
    )
  (spit "results/r3->r4.edn"
        (with-out-str
          (-> {:ih/data (dissoc test-db :r4)}
              (merge super-converter)
              ih/execute
              :ih/data
              clojure.pprint/pprint))))

(->
 #:ih {:direction [:r4 :r3]
       :rules [{:r3 [:insurance [:*] :id]
                :r4 [:insurance [:*] :id]}]
       :data {:r4 {:insurance [{:focal true}]}}}
 ih/execute
 :ih/data)

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
