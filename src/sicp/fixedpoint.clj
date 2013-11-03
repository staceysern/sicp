(ns sicp.fixedpoint
  (:use sicp.core))

(def tolerance 0.00001)

(defn fixed-point
  ([f first-guess]
     (fixed-point f first-guess false))
  
  ([f first-guess verbose]
     (let [close-enough? (fn [v1 v2]
                           (< (Math/abs (- v1 v2)) tolerance))
           applyf (fn [guess]
                    (let [next (f guess)]
                      (do
                        (if verbose
                          (println next))
                        (if (close-enough? guess next)
                          next
                          (recur next)))))]
       (applyf first-guess))))

(defn average-damp [f]
  (fn [x] (average x (f x))))

