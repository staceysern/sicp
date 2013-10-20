(ns sicp.1-35
  (:use sicp.fixedpoint))

(defn transformation [x]
  (+ 1 (/ 1 x)))

(defn golden-ratio []
  (fixed-point transformation 1.0))
