(ns sicp.1-43-test
  (:require [midje.sweet :refer :all]
            [sicp.1-43 :refer :all]
            [sicp.core :refer :all]))

(facts "repeated"
       ((repeated square 1) 5) => 25
       ((repeated square 2) 5) => 625
       )




          
