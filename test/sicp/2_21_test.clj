(ns sicp.2-21-test
  (:require [midje.sweet :refer :all]
            [sicp.2-21 :refer :all]))

(facts "square-list-r"
  (square-list-r '( 1 2 3 4)) => '(1 4 9 16)
  )

(facts "square-list-m"
  (square-list-m '( 1 2 3 4)) => '(1 4 9 16)
  )
