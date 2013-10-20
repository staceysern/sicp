(ns sicp.1-14)

(defn first-denomination [kinds-of-coins]
  (cond (= kinds-of-coins 1) 1
        (= kinds-of-coins 2) 5
        (= kinds-of-coins 3) 10
        (= kinds-of-coins 4) 25
        (= kinds-of-coins 5) 50))

(defn cc [amount kinds-of-coins]
  (letfn [(cc-level [amount kinds-of-coins level]
            ;; (println level "(cc" amount kinds-of-coins ")")
            (cond (= amount 0) 1
                  (or (< amount 0) (= kinds-of-coins 0)) 0
                  :else (+ (cc-level amount
                                     (- kinds-of-coins 1)
                                     (+ level 1))
                           (cc-level (- amount
                                        (first-denomination kinds-of-coins))
                                     kinds-of-coins
                                     (+ level 1)))))]
    (cc-level amount kinds-of-coins 0)))








