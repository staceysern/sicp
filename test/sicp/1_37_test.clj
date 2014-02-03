(ns sicp.1-37-test
  (:require [midje.sweet :refer :all]
            [sicp.1-37 :refer :all]))

(facts "cont-frac"
  (< (Math/abs (- (golden-ratio) 1.618)) 0.001) => true
  )

(facts "cont-frac-i"
  (< (Math/abs (- (golden-ratio) 1.618)) 0.001) => true)
