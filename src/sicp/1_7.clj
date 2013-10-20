(ns sicp.1-7
  (:use sicp.core)
  (:use sicp.1-6))

;; good-enough? doesn't work well for small numbers because the
;; tolerance used is large in relation to the small number.  For large
;; numbers, floating point numbers lose precision and the machine may
;; not be able to distinguish between two numbers whose difference is
;; larger than the tolerance.

(defn sqrt-iter2 [last-guess guess x]
  (if (< (Math/abs (- last-guess guess)) 0.00001)
    guess
    (sqrt-iter2 guess (improve guess x) x)))

(defn sqrt2 [x]
  (sqrt-iter2 -1.0 1.0 x))

(sqrt2 0.0025)
;; 0.05000000000074607

(sqrt 0.0025)
;; 0.05423762280896765

