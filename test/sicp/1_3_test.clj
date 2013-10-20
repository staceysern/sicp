(ns sicp.1-3-test
  (:require [midje.sweet :refer :all]
            [sicp.1-3 :refer :all]))

(facts "sos-two-biggest"
       (sos-two-biggest 2 3 1) => 13
       (sos-two-biggest 1 2 3) => 13
       (sos-two-biggest 2 1 3) => 13
       )
