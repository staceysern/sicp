(ns sicp.1-11)

(defn f-recursive [n]
  (if (< n 3)
    n
    (+ (f-recursive (- n 1))
       (* 2 (f-recursive (- n 2)))
       (* 3 (f-recursive (- n 3))))))

(defn f-iterative [n]
  (let [iter (fn [minus3, minus2, minus1, n]
               (let [next (+ minus1 (* 2 minus2) (* 3 minus3))]
                 (if (= n 0)
                   next
                   (recur minus2, minus1, next, (- n 1)))))]
    (if (< n 3)
      n
      (iter 0 1 2 (- n 3)))))

