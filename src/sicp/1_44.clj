(ns sicp.1-44
  (:use sicp.1-43))

(defn smooth [f]
  (let [dx 0.00001]
    (fn [x] (/ (+ (f (- x dx))
                 (f x)
                 (f (+ x dx)))
              3))))

(defn nth-fold-smooth [f n]
  (repeated (smooth f) n))
