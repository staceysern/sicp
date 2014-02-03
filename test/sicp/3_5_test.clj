(ns sicp.3-5-test
  (:require [midje.sweet :refer :all]
            [sicp.core :refer [square]]
            [sicp.3-5 :refer :all]))

(defn in-unit-circle [x y]
  (<= (+ (square x) (square y)) 1))

(facts "estimate-integral"
  (< (Math/abs (- (estimate-integral in-unit-circle -1 1 -1 1 1000000) 3.1415))
     0.01) => true

  (< (Math/abs (- (estimate-integral in-unit-circle -4 10 -3 5 1000000) 3.1415))
     0.03) => true
  )
