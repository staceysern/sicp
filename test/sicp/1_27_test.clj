(ns sicp.1-27-test
  (:require [midje.sweet :refer :all]
            [sicp.1-27 :refer :all]))

(facts "charmichael"
  (charmichael? 561) => true
  (charmichael? 1105) => true
  (charmichael? 1729) => true
  (charmichael? 2465) => true
  (charmichael? 2821) => true
  (charmichael? 6601) => true
  (charmichael? 2820) => false
)
