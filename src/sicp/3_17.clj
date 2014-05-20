(ns sicp.3-17
  (:require [sicp.cons :refer [make-cons-cell car cdr pair?]]))

(defn count-pairs
  ([x] (first (count-pairs x [])))
  ([x visited]
     (if (or (not (pair? x))
             (some #{x} visited))
       [0 visited]
       (let [[car-count visited'] (count-pairs (car x) (conj visited x))
             [cdr-count visited''] (count-pairs (cdr x) visited')]
         [(+ 1 car-count cdr-count) visited'']))))

(count-pairs (make-cons-cell :a (make-cons-cell :b (make-cons-cell :c nil))))
;; 3

(def second (make-cons-cell :b nil))
(def first (make-cons-cell :a second))
(count-pairs (make-cons-cell first second))
;; 3

(def bottom (make-cons-cell :a :b))
(def middle (make-cons-cell bottom bottom))
(def top (make-cons-cell middle middle))
(count-pairs top)
;; 3
