(ns sicp.3-24-test
  (:require [midje.sweet :refer :all]
            [sicp.3-24 :refer :all]))

(facts "make-table"
  (let [table (make-table =)
        insert! (table :insert-proc!)
        lookup (table :lookup-proc)]
    (lookup :math "+") => false
    ((table :invalid-proc)) => (throws Exception)

    (insert! :math "+" 43)
    (insert! :math "-" 45)
    (insert! :letters "a" 97)
    (insert! :letters "b" 98)

    (lookup :math "+") => 43
    (lookup :math "-") => 45
    (lookup :letters "a") => 97
    (lookup :letters "b") => 98

    (lookup :letters "+") => false)
  )
