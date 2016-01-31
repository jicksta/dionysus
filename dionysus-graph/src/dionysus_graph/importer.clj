(ns dionysus-graph.importer
  (:require
    [clojure.string :as str]
    [clj-leveldb :as leveldb]
    [ogre.tinkergraph :as g]
    [ogre.core :as q]))

(defn timestamp-from-key [key]
  "Returns the unique numerical timestamp for the given key"
  (head (skip 2 (str/split key "."))))

(def bookmarks
  (map (keyspace from-db '(db pinboard * *))))

(defn main []
  (let [from-db (leveldb/open "/data/dionysus-db-pinboard")
        to-graph (g/open "/data/dionysus-graph")]
    (doseq bookmarks
         ())))
