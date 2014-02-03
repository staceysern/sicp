(ns sicp.1-21-test
  (:require [midje.sweet :refer :all]
            [sicp.1-21 :refer :all]))

(facts "smallest-divisor"
  (smallest-divisor 199) => 199
  (smallest-divisor 1999) => 1999
  (smallest-divisor 19999) => 7
  )
