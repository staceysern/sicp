(ns sicp.3-7)

(defn make-joint [account password new-password]
  (if (= ((account password :withdraw) 0) "Incorrect password")
    (throw (Exception. "Incorrect password"))
    (fn [challenge action]
      (if (= challenge new-password)
        (account password action)
        (fn [amount] "Incorrect password")))))
