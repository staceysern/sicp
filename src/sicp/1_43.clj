(ns sicp.1-43
  (:use sicp.1-42))

(defn repeated [f times]
  (if (= times 1)
    (fn [x] (f x))
    (compose f (repeated f (dec times)))))



