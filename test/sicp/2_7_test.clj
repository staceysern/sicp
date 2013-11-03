(ns sicp.2-7-test
  (:require [midje.sweet :refer :all]
            [sicp.interval :refer :all]
            [sicp.2-7 :refer :all]))

(facts "lower-bound"
       (lower-bound (make-interval 2 3)) => 2
       )

(facts "upper-bound"
       (upper-bound (make-interval 2 3)) => 3
       )

