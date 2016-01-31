(ns dionysus-graph.keyspace-test
  (:require [clojure.test :refer :all]
            [dionysus-graph.keyspace :refer :all]))

(deftest split-wildcards
  (testing "Simplifies a bookmark key-value pair"
    (is (simplify-kvp [])))
