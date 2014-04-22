(ns farsi-trans.core-test
  (:require [clojure.test :refer :all]
            [farsi-trans.core :refer :all]))

(deftest test-transcribe
  (is (= (transcribe "صدای") "sday")))
