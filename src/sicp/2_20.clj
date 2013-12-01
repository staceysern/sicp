(ns sicp.2-20)

(defn same-parity [x & xs]
  (let [pred (if (even? x) even? odd?)
        iter (fn [lst result]
               (cond (not (seq lst)) (seq result)
                     (pred (first lst)) (recur
                                         (rest lst)
                                         (conj result (first lst)))
                     :else (recur (rest lst) result)))]
    (iter xs (vector x))))
