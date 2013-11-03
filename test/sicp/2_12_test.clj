(ns sicp.2_12-test
  (:require [midje.sweet :refer :all]
            [sicp.2-12 :refer :all]))

(facts "make-center-percent"
       (< (- (percent (make-center-percent 5.0 8)) 8.0) 0.00001) => true
       (< (- (center (make-center-percent 5.0 8)) 5.0) 0.00001) => true
       )



