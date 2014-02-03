(ns sicp.3-1-test
  (:require [midje.sweet :refer :all]
            [sicp.3-1 :refer :all]))

(facts "make-accumulator"
  (let [accumulator (make-accumulator 5)]
    (accumulator 10) => 15
    (accumulator 10) => 25)
  )
