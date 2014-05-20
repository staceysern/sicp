(ns sicp.3-16
  (:require [sicp.cons :refer [make-cons-cell car cdr pair?]]))

(defn count-pairs [!v]
  (if (not (pair? !v))
    0
    (+ (count-pairs (car !v))
       (count-pairs (cdr !v))
       1)))

(count-pairs (make-cons-cell :a (make-cons-cell :b (make-cons-cell :c nil))))
;; 3

(def second (make-cons-cell :b nil))
(def first (make-cons-cell :a second))
(count-pairs (make-cons-cell first second))
;; 4

(def bottom (make-cons-cell :a :b))
(def middle (make-cons-cell bottom bottom))
(def top (make-cons-cell middle middle))
(count-pairs top)
;; 7
