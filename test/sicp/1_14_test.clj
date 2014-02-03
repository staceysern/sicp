(ns sicp.1-14-test
  (:require [midje.sweet :refer :all]
            [sicp.1-14 :refer :all]))

(facts "count change"
  (cc 100 5) => 292
  )
