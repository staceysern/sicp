(ns sicp.2_19-test
  (:require [midje.sweet :refer :all]
            [sicp.2-19 :refer :all]))

(def us-coins '(50 25 10 5 1))

(facts "cc"
  (cc 100 us-coins) => 292
  (cc 100 (reverse us-coins)) => 292
  )
