(ns farsi-trans.core-test
  (:require [clojure.test :refer :all]
            [farsi-trans.core :refer :all]))

(deftest test-transcribe_1
  (is (= (transcribe "صدای") "sday")))

(deftest test-transcribe_2
  (is (= (transcribe "سیب") "syb")))

(deftest test-transcribe_3
  (is (= (transcribe "پاپوش") "papuş")))

(deftest test-transcribe_4
  (is (= (transcribe "خسته") "hsth")))

(deftest test-transcribe_5
  (is (= (transcribe "درد") "drd")))

(deftest test-transcribe_6
  (is (= (transcribe "انديشه") "andyşh")))

(deftest test-transcribe_7
  (is (= (transcribe "جنگ") "cng")))

(deftest test-transcribe_8
  (is (= (transcribe "چابك") "çabk")))

(deftest test-transcribe_9
  (is (= (transcribe "بهار") "bhar")))

(deftest test-transcribe_10
  (is (= (transcribe "هنوز") "hnuz")))

(deftest test-transcribe_11
  (is (= (transcribe "طاش") "taş")))

