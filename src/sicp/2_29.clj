(ns sicp.2-29)

(defn make-mobile [left right]
  (list left right))

(defn make-branch [length structure]
  (list length structure))

(defn left-branch [mobile]
  (first mobile))

(defn right-branch [mobile]
  (last mobile))

(defn branch-length [branch]
  (first branch))

(defn branch-structure [branch]
  (last branch))

(declare mobile-weight)

(defn branch-weight [branch]
  (if (sequential? (branch-structure branch))
    (mobile-weight (branch-structure branch))
    (branch-structure branch)))

(defn mobile-weight [mobile]
  (+ (branch-weight (left-branch mobile))
     (branch-weight (right-branch mobile))))

(defn balanced? [mobile]
  (let [left (left-branch mobile)
        right (right-branch mobile)]
    (and (= (* (branch-length left) (branch-weight left))
            (* (branch-length right) (branch-weight right)))
         (or (not (sequential? (branch-structure left)))
             (balanced? (branch-structure left)))
         (or (not (sequential? (branch-structure right)))
             (balanced? (branch-structure right))))))
