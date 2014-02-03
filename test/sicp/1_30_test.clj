(ns sicp.1-30-test
  (:require [midje.sweet :refer :all]
            [sicp.1-30 :refer :all]
            [sicp.core :refer [cube]]))

(facts "sum-iter"
  (sum-iter cube 1 inc 10) => 3025
  (sum-iter identity 1 inc 10) => 55
  )
