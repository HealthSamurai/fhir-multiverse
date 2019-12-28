(ns multiverse.spec-generator
  (:require [multiverse.fhir :as fhir]
            [clojure.string :as string]
            [clojure.spec.alpha :as s]
            [spec-provider.provider :as sp]
            [clojure.java.io :as io]
            [clojure.pprint :as pp]))

(def r3 (fhir/load-version "3.0.1"))
(def r4 (fhir/load-version "4.0.0"))

(defn- p [v]
  (println v)
  v)

(defn- ns->file [ns-str]
  (apply io/file
         (concat [(io/file "./src")]
                 (-> ns-str
                     (string/replace #"\-" "_")
                     (string/replace #"\." " ")
                     (str ".clj")
                     (string/split #"\s+")))))

(defn- get-template [template]
  (slurp
   (io/resource (format "templates/%s.txt" (name template)))))

(defn- filter-entities-by-type [version type]
  (->> version :resources :Entity
       (filter
        (fn [[k v]]
          (-> v :type (= type))))
       (into {})))

(def ^:private primitives
  (memoize
   (fn [version]
     (filter-entities-by-type version "primitive"))))

(def ^:private types
  (memoize
   (fn [version]
     (filter-entities-by-type version "type"))))

(def ^:private resources
  (memoize
   (fn [version]
     (filter-entities-by-type version "resource"))))

(defn- attributes [version]
  (-> version :resources :Attribute))

(defn- get-resource-attributes [version resource]
  (->> (attributes version)
       (filter
        (fn [[k v]]
          (and
           (-> v :resource :resourceType (= "Entity"))
           (-> v :resource :id (= (name resource)))
           (-> v :path count (= 1)))))
       (into {})))

(defn- create-rule-name [k]
  (if k
   (let [n (name k)]
     (str ":"
          (when-not (string/includes? n ".") ":")
          (some-> n (string/replace "." "-"))))
   "::string"
   #_"::NULL"))

(defn gen-primitives [version]
  (->> (primitives version)
       (map
         (fn [[k v]]
           (format ";; %s\n(s/def ::%s %s)"
                   (:description v)
                   (name k)
                   (case k
                     :integer     "int?"
                     :boolean     "boolean?"
                     :unsignedInt "int?"
                     "string?"))))
      (string/join "\n")))

(defn- get-type-id [attr]
  (-> attr :type :id))

(defn- reference? [attr]
  (-> attr :type :id (= "Reference")))

(defn- resource? [attr]
  (-> attr :resource :resourceType (= "Entity")))

(defn- get-attr-resource [attr]
  (-> attr :resource :id))

(defn- primitive? [version attr]
  (let [primitives (->> version primitives (map first) set)]
    (primitives (keyword (get-type-id attr)))))

(defn group->name [resource-type group]
  (create-rule-name (str (name resource-type)
                         (when-not (empty? group)
                           (str "." (->> group (string/join ".") )) ))))

(defn- get-req-attrs [req? attrs]
  (->> attrs
       (filter #(if req?
                  (-> % :isRequired)
                  (-> % :isRequired not)))))

(defn- attr-rule-name [rule-name attr]
  (str ":" rule-name "/" (-> attr :path last)))

(defn- get-req-attrs-str [rule-name req? attrs]
  (->> attrs
       (get-req-attrs req?)
       (map #(attr-rule-name rule-name %))
       (string/join " ")))

(declare gen-attr-value)

(defn gen-coll-attr [version attr]
  (format "(s/coll-of %s)"
          (gen-attr-value
           version
           (dissoc attr :isCollection))))

(defn- gen-reference-attr [version attr]
  (create-rule-name "Reference"))

(defn- gen-resource-attr [version attr]
  (create-rule-name (get-type-id attr)))

(defn- gen-primitive-attr [version attr]
  (create-rule-name (get-type-id attr)))

(defn- gen-attr-value [version attr]
  (let [value-fn (cond
                   (:isCollection attr)      gen-coll-attr
                   (primitive? version attr) gen-primitive-attr
                   (reference? attr)         gen-reference-attr
                   (resource? attr)          gen-resource-attr
                   :else                     pr-str)]
    (value-fn version attr)))

(defn- gen-resource-decl [version resource-name]
  (let [attrs (->> (get-resource-attributes version resource-name)
                   (map second))]
    (format (get-template :decl)
            resource-name
            (str "::" resource-name)
            (get-req-attrs-str resource-name true attrs)
            (get-req-attrs-str resource-name false attrs))))

(defn- gen-resource-attrs [version resource-name]
  (let [attrs (->> (get-resource-attributes version resource-name)
                   (map second))]
    (format (get-template :attr)
            resource-name
            (->> attrs
                   (map
                    (fn [attr]
                      (format (get-template :attr-def)
                              (attr-rule-name resource-name attr)
                              (gen-attr-value version attr))))
                   (string/join "")))))

(comment

 (generate r3 "specs.spec-r3")

 )

(defn generate [version ns-str]
  (let [output-f (ns->file ns-str)]
    (-> output-f .getParentFile .mkdirs)
    (spit output-f
          (format
           (get-template :ns)
           ns-str))
    (spit output-f (gen-primitives version) :append true)
    (spit output-f "\n" :append true)
    (let [declared      (->> (resources version) keys (map name))
          used          (->> (attributes version)
                             (map second)
                             (map get-attr-resource)
                             (remove nil?)
                             distinct)
          all-resources (->> (concat declared used) distinct)]
      (->> all-resources
           (map #(gen-resource-decl version %))
           (remove nil?)
           (map #(spit output-f % :append true))
           doall)
      (->> all-resources
           (map #(gen-resource-attrs version %))
           (remove nil?)
           (map #(spit output-f % :append true))
           doall))))

(comment

  (generate r3 "specs.spec-r3")


  (->> (attributes r3) (map second) #_(map get-attr-resource) #_(remove nil?) #_distinct)

  )
