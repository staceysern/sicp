(ns sicp.2-10-test
  (:require [midje.sweet :refer :all]
            [sicp.2-10 :refer :all]
            [sicp.interval :refer :all]))

(def pos (make-interval 3 10))
(def neg (make-interval -10 -3))
(def span (make-interval -3 10))
(def lower-zero (make-interval 0 10))
(def upper-zero (make-interval -3 0))

(facts "spans-zero?"
       (spans-zero? pos) => false
       (spans-zero? neg) => false
       (spans-zero? span) => true
       (spans-zero? lower-zero) => true
       (spans-zero? upper-zero) => true
       )

(facts "make-center-percent"
       (div-interval-with-error-checking pos neg) => (div-interval pos neg)
       (div-interval-with-error-checking pos pos) => (div-interval pos pos)
       (div-interval-with-error-checking neg neg) => (div-interval neg neg)
       (div-interval-with-error-checking pos span) => (throws Exception)
       (div-interval-with-error-checking span neg) => (div-interval span neg)
       (div-interval-with-error-checking lower-zero pos) => (div-interval lower-zero pos)
       (div-interval-with-error-checking neg lower-zero) => (throws Exception)
       (div-interval-with-error-checking upper-zero neg) => (div-interval upper-zero neg)
       (div-interval-with-error-checking pos upper-zero) => (throws Exception)
       )




