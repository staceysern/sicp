(ns sicp.3-6-test
  (:refer-clojure :exclude [rand])
  (:require [midje.sweet :refer :all]
            [sicp.3-6 :refer :all]))

(facts "make-rand"
  ((rand :reset) 30)
  (rand :generate) => 2895
  (rand :generate) => 11520
  ((rand :reset) 30) => 30
  (rand :generate) => 2895
  )
