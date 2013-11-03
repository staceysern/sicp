(ns sicp.1-46
  (:use sicp.core))

(defn iterative-improve [good-enough? improve]
  (fn [n]
    (let [iter (fn [guess x]
                 (if (good-enough? guess x)
                   guess
                   (recur (improve guess x) x)))]
      (iter 1.0 n))))

(defn sqrt [x]
  ((iterative-improve (fn [guess x] (< (Math/abs (- (square guess) x)) 0.001))
                      (fn [guess x] (average guess (/ x guess))))
   x))
