(ns sicp.3-3)

(defn make-account [balance password]
  (let [!balance (atom balance)
        withdraw (fn [amount]
                   (if (>= @!balance amount)
                     (swap! !balance (fn [balance] (- balance amount)))
                     "Insufficient funds"))
        deposit (fn [amount]
                  (swap! !balance (fn [balance] (+ balance amount))))]
    (fn [challenge action]
      (cond (not= challenge password) (fn [amount] "Incorrect password")
            (= action :withdraw) withdraw
            (= action :deposit) deposit
            :else (throw (Exception. "Unsupported action"))))))
