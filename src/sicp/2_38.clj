(ns sicp.2-38
  (:require [sicp.accumulate :refer [accumulate]]))

(def fold-right accumulate)

(defn fold-left [op initial sequence]
  (let [iter (fn [result rst]
               (if-not (seq rst)
                 result
                 (recur (op result (first rst))
                        (rest rst))))]
    (iter initial sequence)))

;; (fold-right / 1 '(1 2 3))
;; 3/2

;; (fold-left / 1 '(1 2 3))
;; 1/6

;; (fold-right list () '(1 2 3))
;; (1 (2 (3 ())))

;; (fold-left list () '(1 2 3))
;; (((() 1) 2) 3)

;; commutative operation produces the same answer for fold-right and fold-left
;; (fold-right + 0 '(1 2 3))
;; (fold-right + 0 '(1 2 3))
