(ns sicp.1-39
  (:use sicp.core))

(defn cont-frac [n d k op]
  (letfn [(cont-frac-range [i]
            (if (> i k)
              0
              (/ (n i) (op (d i) (cont-frac-range (inc i))))))]
    (cont-frac-range 1)))

(defn tan-cf [x k]
  (let [n (fn [i]
            (if (= i 1)
              x
              (square x)))
        d (fn [i]
            (- (* 2 i) 1.0))]
     (cont-frac n d k -)))



