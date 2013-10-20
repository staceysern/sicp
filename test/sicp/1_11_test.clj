(ns sicp.1-11-test
  (:require [midje.sweet :refer :all]
            [sicp.1-11 :refer :all]))

(facts "f-recursive"
       (f-recursive 0) => 0
       (f-recursive 1) => 1
       (f-recursive 2) => 2
       (f-recursive 3) => 4
       (f-recursive 4) => 11
       )

(facts "f-iterative"
       (f-iterative 0) => 0
       (f-iterative 1) => 1
       (f-iterative 2) => 2
       (f-iterative 3) => 4
       (f-iterative 4) => 11
       )

