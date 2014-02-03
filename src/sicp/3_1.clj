(ns sicp.3-1)

(defn make-accumulator [initial]
  (let [!sum (atom initial)]
    (fn [value]
      (swap! !sum (fn [sum]
                    (+ sum value))))))
