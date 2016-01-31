(ns dionysus-graph.importer-pinboard)


(defn -main [& args]
  (let [from-db (leveldb/open "/data/dionysus-db-pinboard")
        to-graph (g/open "/data/dionysus-graph")]
    (println "Hello world!")))

(def bookmarks
  (map (keyspace from-db '(db pinboard * *))))

;(defn timestamp-from-key [key]
;  "Returns the unique numerical timestamp for the given key"
;  (head (skip 2 (str/split key "."))))
