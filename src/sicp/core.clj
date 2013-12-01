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

(defn log-base [base n]
  (/ (Math/log n) (Math/log base)))

(defn gcd [a b]
  (if (= b 0)
    a
    (gcd b (rem a b))))

(defn append
  ;; Append two sequences into a list
  [seq1 seq2]
  (if-not (seq seq1)
    (sequence seq2)
    (cons (first seq1) (append (rest seq1) seq2))))

