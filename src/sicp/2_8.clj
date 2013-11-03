(ns sicp.2-8
  (:use sicp.interval)
  (:use sicp.2-7))

(defn sub-interval [x y]
  (make-interval (- (lower-bound x) (upper-bound y))
                 (- (upper-bound x) (lower-bound y))))
