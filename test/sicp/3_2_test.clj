(ns sicp.3-2-test
  (:require [midje.sweet :refer :all]
            [sicp.3-2 :refer :all]
            [clojure.math.numeric-tower :refer [sqrt]]))

(facts "make-monitored"
  (let [monitored (make-monitored sqrt)]
    (monitored :how-many-calls?) => 0
    (monitored 100) => 10
    (monitored :how-many-calls?) => 1
    (monitored :reset-count) => 0
    (monitored :how-many-calls?) => 0)
  )
