(ns sicp.2-20-test
  (:require [midje.sweet :refer :all]
            [sicp.2-20 :refer :all]))

(facts "same-parity"
  (same-parity 1 2 3 4 5 6 7 8) => '(1 3 5 7)
  (same-parity 2 3 4 5 6 7 8 9) => '(2 4 6 8)
  )
