(ns sicp.1-33
  (:require [sicp.prime :refer [prime?]]
            [sicp.core :refer [square gcd]]))

(defn filtered-accumulate [pred combiner null-value term a next b]
  (if (> a b)
    null-value
    (if (pred a)
      (combiner (term a)
                (filtered-accumulate pred combiner null-value
                                     term (next a) next b))
      (combiner null-value
                (filtered-accumulate pred combiner null-value
                                     term (next a) next b)))))

(defn sum-of-squares-of-primes [a b]
  (filtered-accumulate prime? + 0 square a inc b))

(defn relatively-prime? [a b]
  (= (gcd a b) 1))

(defn product-of-relatively-prime [n]
  (filtered-accumulate (partial relatively-prime? n) * 1 identity 1 inc n))

(defn product-of-relatively-prime [n]
  (filtered-accumulate #(relatively-prime? n %) * 1 identity 1 inc n))
