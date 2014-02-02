(ns sicp.2-10
  (:require [sicp.interval :refer [make-interval mul-interval]]
            [sicp.2-7 :refer [lower-bound upper-bound]]))

(defn spans-zero? [x]
  (and (<= (lower-bound x) 0)
       (>= (upper-bound x) 0)))

(defn div-interval-with-error-checking [x y]
  (if (spans-zero? y)
    (throw (Exception. "Can't divide by an interval that spans zero"))
    (mul-interval x
                  (make-interval (/ 1.0 (upper-bound y))
                                 (/ 1.0 (lower-bound y))))))
