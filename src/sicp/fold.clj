(ns sicp.fold
  (:require [sicp.accumulate :refer [accumulate]]
            [sicp.core :refer [append]]))

(def fold-right accumulate)

(defn fold-left [op initial sequence]
  (let [iter (fn [result rst]
               (if-not (seq rst)
                 result
                 (recur (op result (first rst))
                        (rest rst))))]
    (iter initial sequence)))

(defn flatmap [proc sequence]
  (accumulate append () (map proc sequence)))
