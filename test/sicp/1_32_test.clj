(ns sicp.1-32-test
  (:require [midje.sweet :refer :all]
            [sicp.1-32 :refer :all]
            [sicp.core :refer :all]))

(facts "accumulate sum"
       (accumulate + 0 identity 1 inc 4) => 10
       (accumulate + 0 square 1 inc 3) => 14
       )

(facts "accumulate product"
       (accumulate * 1 identity 1 inc 4) => 24
       (accumulate * 1 square 1 inc 3) => 36
       )

(facts "accumulate-r product"
       (accumulate-r * 1 identity 1 inc 4) => 24
       (accumulate-r * 1 square 1 inc 3) => 36
       )

(facts "accumulate-r sum"
       (accumulate-r + 0 identity 1 inc 4) => 10
       (accumulate-r + 0 square 1 inc 3) => 14      
       )

(facts "sum"
       (sum identity 1 inc 4) => 10
       (sum square 1 inc 3) => 14
       )

(facts "product"
       (product identity 1 inc 4) => 24
       (product square 1 inc 3) => 36
       )

