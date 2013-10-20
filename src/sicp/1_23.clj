(ns sicp.1-23
  (:use sicp.core)
  (:use sicp.bench))

(defn next-divisor [n]
  (if (= n 2)
    3
    (inc n)))

(defn find-divisor [n test-divisor fun]
  (cond (> (square test-divisor) n) n
        (divides? test-divisor n) test-divisor
        :else (recur n (fun test-divisor) fun)))

(defn smallest-divisor-inc [n]
  (find-divisor n 2 inc))

(defn smallest-divisor-next [n]
  (find-divisor n 2 next-divisor))




