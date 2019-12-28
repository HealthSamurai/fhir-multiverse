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
  (->
   fhir
   (get-in [:resources :Entity])
   keys
   set))

(let [r3-resources      (get-resources r3)
      r4-resources      (get-resources r4)
      added-resources   (clojure.set/difference r4-resources r3-resources)
      deleted-resources (clojure.set/difference r3-resources r4-resources)
      shared-resources  (clojure.set/intersection r3-resources r4-resources)
      ]
    (def diff
      {:resources
       {:added   added-resources
        :deleted deleted-resources
        :shared  shared-resources}})

    (spit
     "resources_diff.edn"
     (with-out-str
       (clojure.pprint/pprint diff)))
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
