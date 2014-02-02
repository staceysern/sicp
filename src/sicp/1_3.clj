(ns sicp.1-3
  (:require [sicp.core :refer [square]]))

(defn sos [x y]
  (+ (square x) (square y)))

(defn sos-two-biggest [x y z]
  (if (= (max x y) x)
    (sos x (max y z))
    (sos y (max x z))))
