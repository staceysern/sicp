(ns sicp.1-45
  (:require [sicp.1-43 :refer [repeated]]
            [sicp.fixedpoint :refer [fixed-point average-damp]]
            [sicp.core :refer [log-base]]
            [clojure.math.numeric-tower :refer [expt]]))

(defn nth-root [n x]
  (let [transformation (fn [y] (/ x (expt y (- n 1))))
        damps (int (Math/floor (log-base 2 n)))]
    (fixed-point ((repeated average-damp damps) transformation) 1.0 true)))
