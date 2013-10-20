(ns sicp.core)

(defn square [n]
  (* n n))

(defn cube [n]
  (* n n n))

(defn divides?
  [divisor dividend]
  (= (rem dividend divisor) 0))

(defn average [x y]
  (/ (+ x y) 2))

(defn halve [x]
  (/ x 2))

(defn dubble [x]
  (+ x x))
