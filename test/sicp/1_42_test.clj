(ns sicp.1-42-test
  (:require [midje.sweet :refer :all]
            [sicp.1-42 :refer :all]
            [sicp.core :refer [square]]))

(facts "compose"
  ((compose square inc) 6) => 49
  )
