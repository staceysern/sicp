(ns sicp.2-39
  (:require [sicp.fold :refer [fold-right fold-left]]
            [sicp.core :refer [append]]))

(defn reverse-r [sequence]
  (fold-right (fn [x y] (append y (list x))) () sequence))

(defn reverse-l [sequence]
  (fold-left (fn [x y] (list* y  x)) () sequence))
