(ns sicp.1-44
  (:require [sicp.1-43 :refer [repeated]]))

(defn smooth [f]
  (let [dx 0.00001]
    (fn [x] (/ (+ (f (- x dx))
                 (f x)
                 (f (+ x dx)))
              3))))

(defn nth-fold-smooth [f n]
  (repeated (smooth f) n))
