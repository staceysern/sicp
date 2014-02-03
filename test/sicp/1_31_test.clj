(ns sicp.1-31-test
  (:require [midje.sweet :refer :all]
            [sicp.1-31 :refer :all]
            [sicp.core :refer [square]]))

(facts "product"
  (product identity 1 inc 4) => 24
  (product square 1 inc 3) => 36
  )

(facts "product-iter"
  (product identity 1 inc 4) => 24
  (product square 1 inc 3) => 36
  )

(facts "factorial"
  (factorial 1) => 1
  (factorial 2) => 2
  (factorial 5) => 120
  (factorial 15) => 1307674368000
  )

#_(facts "pi"
  (< (Math/abs (- (pi) 3.14)) 0.01) => true
  )
