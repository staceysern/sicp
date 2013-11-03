(ns sicp.2-4-test
  (:require [midje.sweet :refer :all]
            [sicp.2-4 :refer :all]))

(facts "car"
       (car (sicp-cons 3 4)) => 3
       )

(facts "cdr"
       (cdr (sicp-cons 3 4)) => 4
       )


