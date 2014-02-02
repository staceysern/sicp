(ns sicp.2-31
  (:require [sicp.core :refer [square]]))

(defn tree-map [f tree]
  (map (fn [sub-tree]
         (if (sequential? sub-tree)
           (tree-map f sub-tree)
           (f sub-tree)))
       tree))

(defn square-tree [tree]
  (tree-map square tree))

(defn scale-tree [factor tree]
  (tree-map (partial * factor) tree))
