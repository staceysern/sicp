(ns sicp.1-35
  (:use sicp.fixedpoint))

(defn golden-ratio []
  (let [transformation (fn [x] (+ 1 (/ 1 x)))]
    (fixed-point transformation 1.0)))
