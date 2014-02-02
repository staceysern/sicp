(ns sicp.2-37
  (:require [sicp.accumulate :refer [accumulate]]
            [sicp.2-36 :refer [accumulate-n]]))

(defn dot-product [v w]
  (accumulate + 0 (map * v w)))

(defn matrix-*-vector [m v]
  (map (fn [x] (dot-product x v)) m))

(defn transpose [matrix]
  (accumulate-n cons () matrix))

(defn matrix-*-matrix [m n]
  (let [cols (transpose n)]
    (map (fn [row] (matrix-*-vector cols row)) m)))
