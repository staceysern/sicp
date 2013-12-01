(ns sicp.2-39
  (:use sicp.fold)
  (:use sicp.core))

(defn reverse-r [sequence]
  (fold-right (fn [x y] (append y (list x))) () sequence))

(defn reverse-l [sequence]
  (fold-left (fn [x y] (list* y  x)) () sequence))


