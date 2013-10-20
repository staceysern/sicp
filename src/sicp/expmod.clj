(ns sicp.expmod
  (use sicp.core))

(defn expmod [base exp m]
  (cond (= exp 0) 1
        (even? exp) (rem (square (expmod base (/ exp 2) m))
                         m)
        :else (rem (* base (expmod base (- exp 1) m))
                   m)))
