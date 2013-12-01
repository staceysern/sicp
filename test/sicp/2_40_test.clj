(ns sicp.2-40-test
  (:require [midje.sweet :refer :all]
            [sicp.2-40 :refer :all]))

(facts "unique-pairs"
       (unique-pairs 1) => ()
       (unique-pairs 2) => '((2 1))
       (unique-pairs 3) => '((2 1) (3 1) (3 2))
       )

(facts "prime-sum-pairs"
       (prime-sum-pairs 6) => '((2 1 3) (3 2 5) (4 1 5) (4 3 7) (5 2 7)
                                (6 1 7) (6 5 11))
       )





