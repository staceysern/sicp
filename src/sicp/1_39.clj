(ns sicp.1-39
  (:use sicp.core)
  (:use sicp.1-37))

(defn tan-cf [x k]
  (let [n (fn [i]
            (if (= i 1)
              x
              (* -1 (square x))))
        d (fn [i]
            (- (* 2 i) 1.0))]
     (cont-frac n d k)))


