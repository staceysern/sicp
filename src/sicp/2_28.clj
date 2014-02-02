(ns sicp.2-28
  (:require [sicp.core :refer [append]]))

(defn fringe [lst]
  (let [iter (fn [lst result]
               (cond (not (seq lst)) (sequence result)

                     (sequential? (first lst))
                     (recur (rest lst) (vec (append result
                                                    (fringe (first lst)))))

                     :else (recur (rest lst) (conj result (first lst)))))]
    (iter lst [])))
