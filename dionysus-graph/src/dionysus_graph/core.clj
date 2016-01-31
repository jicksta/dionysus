(ns dionysus-graph.core
  (:require
    [clojure.string :as str]
    [clj-leveldb :as leveldb]
    [clojurewerkz.titanium.graph :as tg]
    [clojurewerkz.titanium.vertices :as tv]))


(defn keyspace [db pattern]
  (let [start-with (str/join "." (take-while pattern #(not= % '*)))
        ]
    (leveldb/iterator db scan-start)
  ; (take-while
    ; (fn [key value]
      ; (= timestamp (timestamp-from-key key))

; Traverse all pinboard links and create vertices for the bookmarks with KVPs
; for the important properties, then create edges to tags

; TODO: I have to TDD this

(defn timestamp-from-key [key]
  "Returns the unique numerical timestamp for the given key"
  (head (skip 2 (str/split key "."))))

(defn simplify-kvp [key value]
  [(keyword key) value])


(def scan-bookmarks [db-seq]
  (lazy-seq
    (let [[start-key] (head db-seq)]
          timestamp (timestamp-from-key start-key)
          properties (sorted-map-by
                       (map simplify-kvp
                            )
                              db-seq))]
      [timestamp properties]))


(def vertex-from-record [graph record]
  (tv))
