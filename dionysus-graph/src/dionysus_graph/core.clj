(ns dionysus-graph.core
  (:require
    [clojure.string :as str]
    [clj-leveldb :as leveldb]
    [ogre.tinkergraph :as g]
    [ogre.core :as q]))

(defn simplify-kvp [key value]
  ((keyword key) value))


