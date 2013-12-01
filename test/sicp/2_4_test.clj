(ns sicp.2-4-test
  (:refer-clojure :exclude [cons])
  (:require [midje.sweet :refer :all]
            [sicp.2-4 :refer :all]))

(facts "car"
       (car (cons 3 4)) => 3
       )

(facts "cdr"
       (cdr (cons 3 4)) => 4
       )


