(ns multiverse.fhir
  (:require [clojure.java.io :as io]
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

(defn get-resources-diff [get-resources key]
  (let [r3-resources      (get-resources r3)
        r4-resources      (get-resources r4)
        added-resources   (clojure.set/difference r4-resources r3-resources)
        deleted-resources (clojure.set/difference r3-resources r4-resources)
        shared-resources  (clojure.set/intersection r3-resources r4-resources)]
    {:added   {:count (count added-resources)
               key added-resources}
     :deleted {:count (count deleted-resources)
               key deleted-resources}
     :shared  {:count (count shared-resources)
               key shared-resources}}
    ))


(def diff
  {:resources (get-resources-diff get-resources :resources)
   :types (get-resources-diff get-types :types)
   :primitives (get-resources-diff get-primitives :primitives)})

(spit
 "results/diff.edn"
 (with-out-str
   (clojure.pprint/pprint diff)))

(def different-objects
  [:Patient :HumanName :decimal])

(->>
    (get-in r4 [:resources :Entity])
    (filter #(get-in % [1 :type]))
    keys
    )

(clojure.pprint/pprint diff)

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
