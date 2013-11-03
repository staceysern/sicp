(ns sicp.2-5-test
  (:require [midje.sweet :refer :all]
            [sicp.2-5 :refer :all]
            [clojure.contrib.math :refer :all]))

(facts "num-divides"
       (num-divides (expt 2 4) 2) => 4
       (num-divides (expt 3 7) 3) => 7
       )

(facts "car"
       (car (sicp-cons 10 5)) => 10
       )

(facts "cdr"
       (cdr (sicp-cons 10 5)) => 5
       )



