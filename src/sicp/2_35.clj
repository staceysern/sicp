(ns sicp.2-35
  (:use sicp.core)
  (:use sicp.accumulate))

(defn enumerate-tree [tree]
  (cond (not (sequential? tree)) (list tree)
        (not (seq tree)) ()
        :else (append (enumerate-tree (first tree))
                      (enumerate-tree (rest tree)))))

(defn count-leaves [t]
  (accumulate + 0 (map (constantly 1) (enumerate-tree t))))


