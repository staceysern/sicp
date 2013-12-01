(ns sicp.2-19)

(defn first-denomination [coins]
  (first coins))

(defn except-first-denomination [coins]
  (rest coins))

(defn no-more? [coins]
  (not (seq coins)))

(defn cc [amount coin-values]
  (cond (= amount 0) 1
        (or (< amount 0) (no-more? coin-values)) 0
        :else (+ (cc amount
                     (except-first-denomination coin-values))
                 (cc (- amount
                        (first-denomination coin-values))
                     coin-values))))
