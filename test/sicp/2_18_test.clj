(ns sicp.2-18-test
  (:refer-clojure :exclude [reverse])
  (:require [midje.sweet :refer :all]
            [sicp.2-18 :refer :all]))

(facts "reverse"
  (reverse '(1 4 9 16 25)) => '(25 16 9 4 1)
  (reverse '()) => '()
  (reverse '(1)) => '(1)
  (reverse '((1 4 9) 16 (3 4))) => '((3 4) 16 (1 4 9))
  )
