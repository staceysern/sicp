(ns sicp.prime
  (use sicp.1-21))

(defn prime? [n]
  (= n (smallest-divisor n)))
