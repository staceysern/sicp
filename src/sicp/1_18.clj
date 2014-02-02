(ns sicp.1-18
  (:require [sicp.core :refer [dubble halve]]))

(defn fast-mult-iter [a b]
  (letfn [(iter [a b acc]
            (cond (= b 0) acc
                  (even? b) (recur (dubble a) (halve b) acc)
                  :else (recur a (dec b) (+ acc a))))]
    (iter a b 0)))
