(ns sicp.1-10)

;; A(x, y) -> 0 if y = 0
;;            2 if y = 1 and x > 0
;;            2y if x = 0g
;;            A(x-1, A(x, y-1)) if x > 0 and y > 1

(defn A [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                 (A x (- y 1)))))

(A 1 10)
;; 1024

(A 2 4)
;; 65536

(A 3 3)
;; 65536

(defn f [n]
  (A 0 n))

;; f(n) = 2n

(defn g [n]
  (A 1 n))

;; g(n) = 2^^n
;; g(n) =  A(1, n) = 2*A(1, n-1) = 2*2*A(1, n-2)

(defn h [n]
  (A 2 n))

;; h(n) = 0 for n = 0
;;        2 for n = 1
;;        2^^h(n-1) for n > 1

