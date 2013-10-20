(ns sicp.1-8-test
  (:require [midje.sweet :refer :all]
            [sicp.1-8 :refer :all]))

(facts "cuberoot"
       (< (Math/abs (- (cuberoot 27) 3)) 0.00001) => true
       )
