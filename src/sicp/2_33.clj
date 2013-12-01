(ns sicp.2-33
  (:use sicp.accumulate)
  (:refer-clojure :exclude [map]))

(defn map [p sequence]
  (accumulate (fn [x y] (cons (p x) y)) () sequence))

(defn append [seq1 seq2]
  (accumulate cons seq2 seq1))

(defn length [sequence]
  (accumulate (fn [_ y] (+ 1 y)) 0 sequence))
