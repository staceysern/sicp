(ns sicp.1-16-test
  (:require [midje.sweet :refer :all]
            [sicp.1-16 :refer :all]
            [clojure.math.numeric-tower :refer [expt]]))

(facts "fast-expt-iter"
       (fast-expt-iter 2.0 10) => (expt 2.0 10)
       (fast-expt-iter 10.0 2) => (expt 10.0 2)
       (fast-expt-iter 1 1000) => 1
       )
