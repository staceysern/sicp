(ns sicp.3-25-test
  (:require [midje.sweet :refer :all]
            [sicp.3-25 :refer :all]))

(facts "make-table"
  (let [table (make-table)]
    (lookup table :math "+") => false

    (insert! table 43 :math "+")
    (insert! table 45 :math "-")
    (insert! table 97 :letters "a")
    (insert! table 98 :letters "b")

    (lookup table :math "+") => 43
    (lookup table :math "-") => 45
    (lookup table :letters "a") => 97
    (lookup table :letters "b") => 98

    (lookup table :letters "+") => false

    (insert! table 72 :l1 :l2 :l3)
    (lookup table :l1 :l2 :l3) => 72)
  )
