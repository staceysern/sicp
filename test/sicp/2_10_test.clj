(ns sicp.2_10-test
  (:require [midje.sweet :refer :all]
            [sicp.2-10 :refer :all]
            [sicp.interval :refer :all]))

(def pos (make-interval 3 10))
(def neg (make-interval -3 -10))
(def span (make-interval -3 10))
(def lower-zero (make-interval 0 10))
(def upper-zero (make-interval -3 0))

(facts "make-center-percent"
       (div-interval-with-error-checking pos neg) => (div-interval pos neg)
       (div-interval-with-error-checking pos pos) => (div-interval pos pos)
       (div-interval-with-error-checking neg neg) => (div-interval neg neg)
       (div-interval-with-error-checking pos span) => (throws Exception)
       (div-interval-with-error-checking span neg) => (throws Exception)
       (div-interval-with-error-checking lower-zero pos) => (throws Exception)
       (div-interval-with-error-checking neg lower-zero) => (throws Exception)
       (div-interval-with-error-checking upper-zero neg) => (throws Exception)
       (div-interval-with-error-checking pos upper-zero) => (throws Exception)
       )



