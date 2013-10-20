(ns sicp.1-23-test
  (:require [midje.sweet :refer :all]
            [sicp.1-23 :refer :all]))

(facts "smallest-divisor-inc"
       (smallest-divisor-inc 199) => 199
       (smallest-divisor-inc 1999) => 1999
       (smallest-divisor-inc 19999) => 7
       )

(facts "smallest-divisor-next"
       (smallest-divisor-next 199) => 199
       (smallest-divisor-next 1999) => 1999
       (smallest-divisor-next 19999) => 7
       )

