(ns sicp.1-31 
  (:use sicp.core))

(defn product [term a next b]
  (if (> a b)
    1
    (* (term a)
       (product term (next a) next b))))

(defn product-iter [term a next b]
  (let [iter (fn [a result]
               (if (> a b)
                 result
                 (recur (next a) (* (term a) result))))]
    (iter a 1)))

(defn factorial [n]
  (product-iter identity 1 inc n))

(defn pi []
  (let [top (fn [n]
              ;; Produces the sequence 2 4 4 6 6 8 ...
              (+ 2 (* 2 (quot (+ n 1) 2)))
              )
        bottom (fn [n]
                 ;; Produces the sequence 3 3 5 5 7 7 ...
                 (+ 3 (* (quot n 2) 2)))
        pi-term (fn [n]
                  (/ (top n) (bottom n)))]
    (* 4.0 (product-iter pi-term 0 inc 10000))))







