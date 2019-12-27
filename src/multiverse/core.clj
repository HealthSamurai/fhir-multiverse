(ns multiverse.core
  (:require [web.core]
            [db.core]
            [multiverse.fhir :refer [load-version]]
            [clojure.set]
            [route-map.core :as route-map])
  (:gen-class))



(def r4 (load-version "4.0.0"))
(def r3 (load-version "3.3.0"))

(def versions
  {"r4" r4
   "r3" r3})

(defn welcome-ctrl
  [{db :db {{q :q} :params} :request}]
  (let [r4-res (into #{} (keys (get-in r4 [:resources :Entity])))
        r3-res (into #{} (keys (get-in r3 [:resources :Entity])))]
    {:status 200
     :body {:deleted (clojure.set/difference r3-res r4-res)
            :added  (clojure.set/difference r4-res r3-res)
            :stable (clojure.set/intersection r3-res r4-res)}}))


(defn search-ctrl
  [{db :db {{v :version :as params} :params} :request}]
  (let [rt (keyword (:resource-type params))
        pth [v :resources :Entity rt]]
    (if-let [metadata (get-in versions pth)]
      {:status 200
       :body metadata}

      {:status 404
       :body {:params params :path pth}})))

(defn create-ctrl
  [{db :db {params :params} :request}]
  {:status 200
   :body params})

(def routes
  {:GET welcome-ctrl
   [:version] {[:resource-type] {:GET search-ctrl
                                 :POST create-ctrl}}})


(defn handler [{req :request :as ctx}]
  (let [route   (route-map/match [(or (:request-method req) :get) (:uri req)] routes)]
    (if-let [handler (:match route)]
      (let [params (merge (or (:params req) {}) (:params route))]
        (handler (assoc-in ctx [:request :params] params)))
      {:status 404
       :body (str [(or (:request-method req) :get) (:uri req)] "not found" route)})))

(defn start [cfg]
  (let [ctx (atom {:cfg cfg})
        db (when (:db cfg) (db.core/datasource (:db cfg)))
        _ (swap! ctx assoc :db db)
        disp (fn [req] (handler (assoc @ctx :request req)))
        _ (swap! ctx assoc :dispatch disp)
        web (when (:web cfg) (web.core/start {:port 8887} disp))
        _ (swap! ctx assoc :web web)]
    ctx))

(defn stop [ctx]
  (try
    (when-let [srv (:web @ctx)] (srv))
    (catch Exception e))
  (try
    (when-let [db (:db @ctx)] (db.core/shutdown db))
    (catch Exception e)))

(defn dispatch [ctx req]
  ((:dispatch @ctx) req))

(defn db-from-env []
  (db.core/db-spec-from-env))

(defn -main [& args]
  (start {:db (db-from-env) 
          :web {}}))

(comment
  (def ctx (start {:db (db.core/db-spec-from-env)
                   :web {}}))

  (:db @ctx)

  (dispatch ctx {:uri "/"})
  (dispatch ctx {:uri "/db/tables" :params {:q "class"}})

  (stop ctx)


  )
