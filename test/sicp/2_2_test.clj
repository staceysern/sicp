(ns sicp.2-1-test
  (:require [midje.sweet :refer :all]
            [sicp.2-1 :refer :all]))

(def point1 (make-point 0 1))
(def point2 (make-point 5 1))
(def segment (make-segment point1 point2))

(facts "points"
       (x-point point1) => 0
       (y-point point1) => 1
       )

(facts "segments"
       (start-segment segment) => point1
       (end-segment segment) => point2
       )

(facts "midpoint-segment"
       (midpoint-segment segment) => (make-point 2.5 1C))
2
