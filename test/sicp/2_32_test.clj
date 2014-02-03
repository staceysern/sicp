(ns sicp.2-32-test
  (:require [midje.sweet :refer :all]
            [sicp.2-32 :refer :all]))

(facts "subsets"
  (subsets '(1 2 3)) => '(() (3) (2) (2 3) (1) (1 3) (1 2) (1 2 3))
  )
