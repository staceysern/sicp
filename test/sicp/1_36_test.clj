(ns sicp.1-36-test
  (:require [midje.sweet :refer :all]
            [sicp.1-36 :refer :all]
            [clojure.contrib.generic.math-functions :refer :all]))

(facts "x-root-of-x"
       (< (Math/abs (- (pow (x-root-of-x 1000)
                            (x-root-of-x 1000))
                       1000))
          
          1) => true
          )

(facts "x-root-of-x-damped"
       (< (Math/abs (- (pow (x-root-of-x-damped 1000) (x-root-of-x-damped 1000))
                       1000))
          1) => true
)


