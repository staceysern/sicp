(ns sicp.1-40
  (:require [sicp.fixedpoint :refer [fixed-point]]
            [sicp.core :refer [cube square]]))

(def dx 0.00001)

(defn deriv [g]
  (fn [x]
    (/ (- (g (+ x dx)) (g x))
       dx)))

(defn newtons-method [g guess]
  (let [newton-transform (fn [g]
                           (fn [x]
                             (- x (/ (g x) ((deriv g) x)))))]
    (fixed-point (newton-transform g) guess)))

(defn sqrt [x]
  (newtons-method (fn [y] (- (square y) x)) 1.0))

(defn cubic [a b c]
  (fn [x]
    (+ (cube x) (* a (square x)) (* b x) c)))
