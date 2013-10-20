(ns sicp.1-6
  (:use sicp.core))

(defn good-enough? [guess x]
  (< (Math/abs (- (square guess) x)) 0.001))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x)
               x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(defn new-if [predicate then-clause else-clause]
  (cond (predicate) then-clause
        :else else-clause))

(comment
  (defn sqrt-iter [guess x]
    (new-if (good-enough? guess x)
            guess
            (sqrt-iter (improve guess x)
                       x))))

;; sqrt-iter results in infinite recursion because, using applicative order,
;; the call to new-if evaluates both the true and false clauses so
;; even when good-enough? returns true, sqrt-iter is called again.
