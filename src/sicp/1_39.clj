(ns sicp.1-39
  (:require [sicp.core :refer [square]]
            [sicp.1-37 :refer [cont-frac]]))

(defn tan-cf [x k]
  (let [n (fn [i]
            (if (= i 1)
              x
              (* -1 (square x))))
        d (fn [i]
            (- (* 2 i) 1.0))]
     (cont-frac n d k)))
