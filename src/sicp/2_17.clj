(ns sicp.2-17)

(defn last-pair [lst]
  (if-not (seq (rest lst))
    (list (first lst))
    (recur (rest lst))))
