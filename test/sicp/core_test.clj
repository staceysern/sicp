(ns sicp.core-test
  (:require [midje.sweet :refer :all]
            [sicp.core :refer :all]))

(facts "square"
       (square 0) => 0
       (square 3) => 9
       (square 100) => 10000
       )

(facts "cube"
       (cube 3) => 27
       (cube 10) => 1000
       (cube 0) => 0
       )

(facts "divides?"
       (divides? 2 10) => true
       (divides? 3 10) => false
       (divides? 10 10) => true
       )

(facts "average"
       (average 0 10) => 5
       (average 2 31) => 33/2
       )

(facts "halve"
       (halve 2) => 1
       (halve 15) => 15/2
       )

(facts "dubble"
       (dubble 0) => 0
       (dubble 25) => 50
       )

(facts "log-base 2"
       (log-base 2 16) => 4.0
       (log-base 2 128) => 7.0
       )

(facts "log-base 3"
       (log-base 3 27) => 3.0
       )
