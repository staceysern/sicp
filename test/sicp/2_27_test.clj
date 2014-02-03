(ns sicp.2-27-test
  (:require [midje.sweet :refer :all]
            [sicp.2-27 :refer :all]))

(facts "deep-reverse"
  (deep-reverse '(1 4 9 16 25)) => '(25 16 9 4 1)
  (deep-reverse '(1)) => '(1)
  (deep-reverse '((1 4 9) 16 (3 4 (5 6)))) => '(((6 5) 4 3) 16 (9 4 1))
  (deep-reverse ()) => ()
  )
