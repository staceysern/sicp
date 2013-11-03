(ns sicp.2-1-test
  (:require [midje.sweet :refer :all]
            [sicp.2-1 :refer :all]))

(facts "make-rat"
       (numer (make-rat 5 10)) => 1
       (denom (make-rat 5 10)) => 2
       (numer (make-rat -5 10)) => -1
       (denom (make-rat -5 10)) => 2
       (numer (make-rat 5 -10)) => -1
       (denom (make-rat 5 -10)) => 2
       (numer (make-rat -5 -10)) => 1
       (denom (make-rat -5 -10)) => 2

       )


