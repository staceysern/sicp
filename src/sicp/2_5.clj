(ns sicp.2-5
  (:refer-clojure :exclude [cons])
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn cons [a b]
  (* (expt 2 a) (expt 3 b)))

(defn num-divides [n d]
  (let [iter (fn [x result]
               (if (zero? (rem x d))
                 (recur (/ x d) (inc result))
                 result))]
    (iter n 0)))

(defn car [n]
  (num-divides n 2))

(defn cdr [n]
  (num-divides n 3))
