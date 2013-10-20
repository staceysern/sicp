(ns sicp.1-16
  (:use sicp.core))

(defn fast-expt-iter [b n]
  (letfn [(iter [b n a]
            (cond (= n 0) a
                  (even? n) (recur (square b) (/ n 2) a)
                  :else (recur b (dec n) (* a b))))]
    (iter b n 1)))
