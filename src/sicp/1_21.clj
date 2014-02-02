(ns sicp.1-21
  (:require [sicp.core :refer [square divides?]]))

(defn find-divisor [n test-divisor]
  (cond (> (square test-divisor) n) n
        (divides? test-divisor n) test-divisor
        :else (recur n (inc test-divisor))))

(defn smallest-divisor [n]
  (find-divisor n 2))
