(ns sicp.fixedpoint)

(def tolerance 0.00001)

(defn fixed-point [f first-guess]
  (let [close-enough? (fn [v1 v2]
                        (< (Math/abs (- v1 v2)) tolerance))
        applyf (fn [guess]
              (let [next (f guess)]
                (if (close-enough? guess next)
                  next
                  (recur next))))]
    (applyf first-guess)))


