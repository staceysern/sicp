(ns sicp.2-1
  (:use sicp.core))

(defn make-rat [n d]
  (let [g (gcd (Math/abs n) (Math/abs d))]
    (if (< d 0)
      (list (quot (* n -1) g) (quot (* d -1) g))
      (list (quot n g) (quot d g)))))

(defn numer [x] (first x))
(defn denom [x] (last x))
