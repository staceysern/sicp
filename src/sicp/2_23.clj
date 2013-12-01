(ns sicp.2-23)

(defn for-each [f lst]
  (when (seq lst)
    (f (first lst))
    (recur f (rest lst))))

;; (for-each (fn [x] (println x)) '(57 321 88))




