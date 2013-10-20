(ns sicp.1-16-test
  (:require [midje.sweet :refer :all]
            [sicp.1-16 :refer :all]
            [clojure.contrib.generic.math-functions :refer :all]))

(facts "fast-expt-iter"
       (fast-expt-iter 2.0 10) => (pow 2 10)
       (fast-expt-iter 10.0 2) => (pow 10 2)
       (fast-expt-iter 1 1000) => 1
       )

