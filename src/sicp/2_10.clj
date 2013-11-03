(ns sicp.2-10
  (:use sicp.interval)
  (:use sicp.2-7))

(defn div-interval-with-error-checking [x y]
  (if (or (<= (* (lower-bound x) (upper-bound x)) 0)
          (<= (* (lower-bound y) (upper-bound y)) 0))
    (throw (Exception. "Can't divide by an interval that spans zero"))
    (mul-interval x
                  (make-interval (/ 1.0 (upper-bound y))
                                 (/ 1.0 (lower-bound y))))))
