(ns sicp.1-29
  (:use sicp.core))

(defn sum [term a next b]
  (if (> a b)
    0
    (+ (term a)
       (sum term (next a) next b))))

(defn simpson-integral [f a b n]
  (let [h (/ (- b a) n)
        coefficient (fn [k]
                      (cond (or (zero? k) (= k n)) 1
                            (even? k) 2
                            :else 4))
        simpson-term (fn [k]
                       (* (coefficient k)
                          (f (+ a (* k h)))))]
    (* (/ h 3) (sum simpson-term 0 inc n)))) 

(simpson-integral cube 0 1 100)
;; 1/4

(simpson-integral cube 0 1 1000)
;; 1/4






