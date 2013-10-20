(ns sicp.1-22
  (:use sicp.prime)
  (:use criterium.core))

(defn search-for-primes [begin end num-to-find]
  (loop [n (if (odd? begin)
             begin
             (inc begin))
         count 0
         acc []]
    (if (or (> n end) (= count num-to-find))
      acc
      (if (prime? n)
        (recur (+ 2 n) (inc count) (conj acc n))
        (recur (+ 2 n) count acc)))))

(search-for-primes 1000 1100 3)
;; [1009 1013 1019]

(search-for-primes 10000 11000 3)
;; [10007 10009 10037]

(search-for-primes 100000 101000 3)
;;[100003 100019 100043]

(search-for-primes 1000000 1001000 3)
;; [1000003 1000033 1000037]



