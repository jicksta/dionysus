(ns dionysus-graph.core-test
  (:require [clojure.test :refer :all]
            [dionysus-graph.core :refer :all]))

(deftest simplify-kvp-test
  (testing "Simplifies a bookmark key-value pair"
    (is (simplify-kvp [])))
