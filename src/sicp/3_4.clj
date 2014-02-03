(ns sicp.3-4)

(defn call-the-cops []
  "The police have been called")

(defn make-account [balance password]
  (let [!balance (atom balance)
        !bad-logins (atom 0)
        withdraw (fn [amount]
                   (if (>= @!balance amount)
                     (swap! !balance (fn [balance] (- balance amount)))
                     "Insufficient funds"))
        deposit (fn [amount]
                  (swap! !balance (fn [balance] (+ balance amount))))]
    (fn [challenge action]
      (if (and (< @!bad-logins 7) (= challenge password))
        (do
          (swap! !bad-logins (fn [bad-logins] 0))
          (cond (= action :withdraw) withdraw
                (= action :deposit) deposit
                :else (throw (Exception. "Unsupported action"))))
        (fn [amount]
          (if (>= @!bad-logins 7)
            (call-the-cops)
            (do
              (swap! !bad-logins (fn [bad-logins] (inc bad-logins)))
              "Incorrect password")))))))
