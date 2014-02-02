(ns sicp.1-17
  (:require [sicp.core :refer [dubble halve]]))

(defn fast-mult [a b]
  (cond (= b 0) 0
        (even? b) (dubble (fast-mult a (halve b)))
        :else (+ a (fast-mult a (- b 1)))))
