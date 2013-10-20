(ns sicp.1-18-test
  (:require [midje.sweet :refer :all]
            [sicp.1-18 :refer :all]))

(facts "fast-mult-iter"
       (fast-mult-iter 100 100) => 10000
       (fast-mult-iter 0 2500) => 0
       (fast-mult-iter 1 75) => 75
       )

