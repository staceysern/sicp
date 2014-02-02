(ns sicp.1-24
  (:require [sicp.expmod :refer [expmod]]))

(defn fermat-test [n]
  (let [try-it (fn [a]
                 (= (expmod a n n) a))]
    (try-it (+ 1 (rand (- n 1))))))

(defn fast-prime? [n times]
  (cond (= times 0) true
        (fermat-test n) (recur n (- times 1))
        :else false))
