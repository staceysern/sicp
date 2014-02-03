(ns sicp.2-8-test
  (:require [midje.sweet :refer :all]
            [sicp.2-8 :refer :all]
            [sicp.interval :refer [make-interval]]))

(facts "sub-interval"
  (sub-interval (make-interval 2 3) (make-interval 4 5)) => (make-interval -3 -1)
  )
