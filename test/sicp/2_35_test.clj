(ns sicp.2-35-test
  (:require [midje.sweet :refer :all]
            [sicp.2-35 :refer :all]))

(facts "enumerate-tree"
       (enumerate-tree '(((1 2) 3) 4 (5 6))) => '(1 2 3 4 5 6)
       (enumerate-tree ()) => ()
       (enumerate-tree '(1)) => '(1)
       )

(facts "count-leaves"
       (count-leaves '(((1 2) 3 4) (1 (2 (3 4))))) => 8
       (count-leaves ()) => 0
       )





