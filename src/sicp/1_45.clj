(ns sicp.1-45
  (:use sicp.1-43)
  (:use sicp.fixedpoint)
  (:use sicp.core)
  (:use [clojure.contrib.generic.math-functions]))

(defn nth-root [n x]
  (let [transformation (fn [y] (/ x (pow y (- n 1))))
        damps (int (Math/floor (log-base 2 n)))]
    (fixed-point ((repeated average-damp damps) transformation) 1.0 true)))


