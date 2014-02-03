(ns sicp.3-2)

(defn make-monitored [f]
  (let [!count (atom 0)]
    (fn [input]
      (cond (= input :how-many-calls?) @!count
            (= input :reset-count) (swap! !count (fn [count] 0))
            :else (do
                    (swap! !count (fn [count] (+ 1 count)))
                    (f input))))))
