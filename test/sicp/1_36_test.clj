(ns sicp.1-36-test
  (:require [midje.sweet :refer :all]
            [sicp.1-36 :refer :all]
            [clojure.math.numeric-tower :refer [expt]]))

(facts "x-root-of-x"
  (< (Math/abs (- (expt (x-root-of-x 1000)
                        (x-root-of-x 1000))
                  1000))
     1) => true
  )

(facts "x-root-of-x-damped"
  (< (Math/abs (- (expt (x-root-of-x-damped 1000) (x-root-of-x-damped 1000))
                  1000))
     1) => true
  )
