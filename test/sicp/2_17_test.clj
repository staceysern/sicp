(ns sicp.2-17-test
  (:require [midje.sweet :refer :all]
            [sicp.2-17 :refer :all]))

(facts "last-pair"
       (last-pair '(23 72 149 34)) => '(34)
       (last-pair '(23)) => '(23)
       )





