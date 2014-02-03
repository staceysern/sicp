(ns sicp.3-8)

(def f
  (let [!n (atom 0)]
    (fn [x]
      (let [value @!n]
        (swap! !n (fn [n] x))
        value))))
