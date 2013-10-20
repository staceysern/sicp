(ns sicp.1-38
  (:use sicp.1-37)
  (:use sicp.core))

(defn e []
  (let [n (fn [i] 1.0)
        d (fn [i]  (if-not (divides? 3 (+ i 1))
                    1
                    (* 2 (/ (+ i 1) 3))))]
    (+ 2 (cont-frac n d 100))))




