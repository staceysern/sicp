(ns sicp.2-31
  (use sicp.core))

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

