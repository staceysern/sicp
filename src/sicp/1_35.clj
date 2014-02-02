(ns sicp.1-35
  (:require [sicp.fixedpoint :refer [fixed-point]]))

(defn golden-ratio []
  (let [transformation (fn [x] (+ 1 (/ 1 x)))]
    (fixed-point transformation 1.0)))
