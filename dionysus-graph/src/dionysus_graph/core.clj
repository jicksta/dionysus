(ns dionysus-graph.core
  (:require
    [clojure.string :as str]
;   [ogre.tinkergraph :as g] [ogre.core :as q]
    [clj-leveldb :as leveldb]))


(defn open-db [path]
  (create-db path
             {:key-decoder byte-streams/to-string
              :val-decoder byte-streams/to-string}))

(defn using-prefix [prefix database]
  )
  "Scopes all database access 
  )
(defn write [key value]
  )
