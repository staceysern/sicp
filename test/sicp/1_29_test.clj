(ns sicp.1-29-test
  (:require [midje.sweet :refer :all]
            [sicp.1-29 :refer :all]
            [sicp.core :refer :all]))

(facts "simpson-integral"
       (simpson-integral cube 0 1 100) => 1/4
       (simpson-integral cube 0 1 1000) => 1/4
       )

