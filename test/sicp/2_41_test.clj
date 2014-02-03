(ns sicp.2-41-test
  (:require [midje.sweet :refer :all]
            [sicp.2-41 :refer :all]))

(facts "unique-triples"
  (unique-triples 1) => ()
  (unique-triples 2) => '()
  (unique-triples 3) => '((3 2 1))
  (unique-triples 4) => '((3 2 1) (4 2 1) (4 3 1) (4 3 2))
  )

(facts "triple-sum?"
  (triple-sum? 5 9) => '((4 3 2) (5 3 1))
  )
