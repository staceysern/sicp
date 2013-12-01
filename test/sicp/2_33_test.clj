(ns sicp.2-33-test
  (:refer-clojure :exclude [map])
  (:require [midje.sweet :refer :all]
            [sicp.2-33 :refer :all]))

(facts "map"
       (map inc '(1 2 3 4)) => '(2 3 4 5)
       (map inc ()) => ()
       )

(facts "append"
       (append '(1 2 3) '(4 5 6)) => '(1 2 3 4 5 6)
       (append () '(4 5 6)) => '(4 5 6)
       (append '(1 2 3) ()) => '(1 2 3)
       (append () ()) => ()
       )

(facts "length"
       (length '(1 2 3 4 5 6)) => 6
       (length ()) => 0
       )



