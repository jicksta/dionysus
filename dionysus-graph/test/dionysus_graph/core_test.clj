(ns dionysus-graph.core-test
  (:require [clojure.test :refer :all]
            [dionysus-graph.core :refer :all]))

(deftest simplify-kvp-test
  (testing "Simplifies a bookmark key-value pair"
    (is (simplify-kvp [])))



(def tmpdir "tmp/test.leveldb")

; Create a new levelDB database, write a key, then read it back.

(deftest db-integration
  (testing "can open a db, write a value and read a value"
    (let [db (open-keyspace tmpdir)])))
