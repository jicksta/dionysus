(ns dionysus-graph.importer)

(def from-db
  (leveldb/open "/data/dionysus-db-pinboard"))

(def to-graph
  (tg/open "/data/dionysus-graph"))

(defn create-bookmark [pairs]
  ())

(def bookmarks
  (map (keyspace from-db '(db pinboard * *))))

(defn main []
  (doseq bookmarks
         ()))
