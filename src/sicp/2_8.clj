(ns sicp.2-8
  (:require [sicp.interval :refer [make-interval]]
            [sicp.2-7 :refer [lower-bound upper-bound]]))

(defn sub-interval [x y]
  (make-interval (- (lower-bound x) (upper-bound y))
                 (- (upper-bound x) (lower-bound y))))
