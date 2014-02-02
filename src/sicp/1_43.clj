(ns sicp.1-43
  (:require [sicp.1-42 :refer [compose]] ))

(defn repeated [f times]
  (if (= times 1)
    (fn [x] (f x))
    (compose f (repeated f (dec times)))))
