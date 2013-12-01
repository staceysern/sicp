(ns sicp.2-34-test
  (:require [midje.sweet :refer :all]
            [sicp.2-34 :refer :all]))

(facts "horner-eval"
       (horner-eval 2 '(1 3 0 5 0 1)) => (+ 1 (* 3 2) (* 5 2 2 2) (* 2 2 2 2 2))
       )





