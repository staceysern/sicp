(ns sicp.2-40
  (:require [sicp.fold :refer [flatmap]]
            [sicp.prime :refer [prime?]]))

(defn unique-pairs [n]
  (flatmap (fn [i]
             (map (fn [j] (list i j))
                  (range 1 i)))
           (range 1 (inc n))))

(defn prime-sum? [pair]
  (prime? (+ (first pair) (last pair))))

(defn make-pair-sum [pair]
  (list (first pair) (last pair) (+ (first pair) (last pair))))

(defn prime-sum-pairs [n]
  (map make-pair-sum (filter prime-sum? (unique-pairs n))))
