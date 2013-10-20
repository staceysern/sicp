(ns sicp.1-17-test
  (:require [midje.sweet :refer :all]
            [sicp.1-17 :refer :all]))

(facts "fast-mult"
       (fast-mult 100 100) => 10000
       (fast-mult 0 2500) => 0
       (fast-mult 1 75) => 75
       )

