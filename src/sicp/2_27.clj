(ns sicp.2-27)

(defn deep-reverse [lst]
  (let [iter (fn [lst result]
               (cond (not (seq lst))
                     result
                     
                     (sequential? (first lst))
                     (recur (rest lst) (conj result
                                             (deep-reverse (first lst))))
                     
                     :else (recur (rest lst) (conj result (first lst)))))]
    (iter lst ())))
