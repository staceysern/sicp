(ns sicp.1-33-test
  (:require [midje.sweet :refer :all]
            [sicp.1-33 :refer :all]
            [sicp.core :refer :all]))

(facts "filtered-accumulate"
       (filtered-accumulate even? + 0 identity 1 inc 10) => 30
       (filtered-accumulate zero? * 1 identity 1 inc 10) => 1
       )

(facts "sum-of-squares-of-primes"
       (sum-of-squares-of-primes 1 10) => (+ 1 4 9 25 49)
       )

(facts "product-of-relatively-prime [n]"
       (product-of-relatively-prime 10) => (* 1 3 7 9))


