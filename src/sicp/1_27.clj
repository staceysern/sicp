(ns sicp.1-27
  (:require [sicp.expmod :refer [expmod]]
            [sicp.prime :refer [prime?]]))

(defn charmichael? [n]
  (loop [a 0]
    (if (= a n)
      (not (prime? n))
      (if-not (= (expmod a n n) (rem a n))
        false
        (recur (inc a))))))
