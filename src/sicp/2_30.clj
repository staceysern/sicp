(ns sicp.2-30
  (:require [sicp.core :refer [square]]))

(defn square-tree [tree]
  (cond (not (sequential? tree)) (square tree)
        (not (seq tree)) ()
        :else (list* (square-tree (first tree))
                     (square-tree (rest tree)))))

(defn square-tree-map [tree]
  (map (fn [sub-tree]
         (if (sequential? sub-tree)
           (square-tree-map sub-tree)
           (square sub-tree)))
       tree))
