(ns sicp.1-35-test
  (:require [midje.sweet :refer :all]
            [sicp.1-35 :refer :all]))

(facts "golden ratio"
       (< (Math/abs (- (golden-ratio) 1.618)) 0.001) => true)





