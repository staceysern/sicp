(ns sicp.2-6-test
  (:require [midje.sweet :refer :all]
            [sicp.2-6 :refer :all]
            [sicp.core :refer :all]))

(facts "zero"
       ((zero inc) 7) => 7
       )

(facts "add-1"
       (((add-1 zero) inc) 7) => 8
       )

(facts "one"
       ((one inc) 10) => 11
       ((one square) 2) => 4
       )

(facts "two"
       ((two inc) 10) => 12
       ((two square) 2) => 16
       )

(facts "add"
       (((add one two) inc) 3) => 6
       )
