(ns sicp.2-28-test
  (:require [midje.sweet :refer :all]
            [sicp.2-28 :refer :all]))

(facts "fringe"
       (fringe '(1 (2 (3 (4 5))))) => '(1 2 3 4 5)
       (fringe '(1 2 3 4 5)) => '(1 2 3 4 5)
       (fringe '(1 (2 (3 4) 5) (((6) 7) 8))) => '(1 2 3 4 5 6 7 8)
       (fringe '(1)) => '(1)
       (fringe ()) => ()
       (fringe [1 [2 [3 [4 5]]]]) => '(1 2 3 4 5)
       (fringe [1 2 3 4 5])  => '(1 2 3 4 5)
       (fringe [1]) => '(1)
       (fringe []) => ()
       )
