(ns dionysus-graph.core-test
  (:require [clojure.test :refer :all]
            [dionysus-graph.core :refer :all]))

(deftest simplify-kvp-test
  (testing "Simplifies a bookmark key-value pair"
    (is (simplify-kvp [])))


; Create a new levelDB database, write a key, then read it back.

(def tmpdir "tmp/test.leveldb")

(deftest simplify-kvp
  (testing "Simplifies a bookmark key-value pair"
    (let [db (open-keyspace tmpdir)])))
