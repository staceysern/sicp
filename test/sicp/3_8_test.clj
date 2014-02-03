(ns sicp.3-8-test
  (:require [midje.sweet :refer :all]
            [sicp.3-8 :refer :all]))

(facts "make-f"
  (+ (f 0) (f 1)) => 0
  (f 0)
  (+ (f 1) (f 0)) => 1
  )
