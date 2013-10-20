(ns sicp.1-6-test
  (:require [midje.sweet :refer :all]
            [sicp.1-6 :refer :all]))

(facts "sqrt"
       (< (Math/abs (- (sqrt 25) 5)) 0.0001) => true
       )
