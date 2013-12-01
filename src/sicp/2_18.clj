(ns sicp.2-18
  (:refer-clojure :exclude [reverse]))

(defn reverse [lst]
  (let [iter (fn [lst result]
               (if-not (seq lst)
                 result
                 (recur (rest lst)
                        (conj result (first lst)))))]
    (iter lst ())))

