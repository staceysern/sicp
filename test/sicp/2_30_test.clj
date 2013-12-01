(ns sicp.2-30-test
  (:require [midje.sweet :refer :all]
            [sicp.2-30 :refer :all]))

(facts "square-tree"
       (square-tree '(1 (2 (3 4) 5) (6 7))) => '(1 (4 (9 16) 25) (36 49))
       (square-tree '(3)) => '(9)
       (square-tree 3) => 9
       (square-tree ()) => ()
       )

(facts "square-tree-map"
       (square-tree-map '(1 (2 (3 4) 5) (6 7))) => '(1 (4 (9 16) 25) (36 49))
       (square-tree-map '(3)) => '(9)
       (square-tree-map ()) => ()
       )
