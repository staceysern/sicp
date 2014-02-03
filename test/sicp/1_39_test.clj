(ns sicp.1-39-test
  (:require [midje.sweet :refer :all]
            [sicp.1-39 :refer :all]))

(facts "tan-cf"
  (< (Math/abs (- (tan-cf 1 100) 1.5574)) 0.0001) => true
  )
