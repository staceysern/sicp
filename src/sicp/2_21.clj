(ns sicp.2-21
  (:require [sicp.core :refer [square]]))

(defn square-list-r [items]
  (if (empty? items)
      nil
      (cons (square (first items))
            (square-list-r (rest items)))))

(defn square-list-m [items]
  (map square items))
