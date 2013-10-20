(ns sicp.1-27
  (use sicp.expmod)
  (use sicp.prime))

(defn charmichael? [n]
  (loop [a 0]
    (if (= a n)
      (not (prime? n))
      (if-not (= (expmod a n n) (rem a n))
        false
        (recur (inc a))))))

