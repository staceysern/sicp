(ns sicp.1-37)

(defn cont-frac [n d k]
  (letfn [(cont-frac-range [i]
            (if (> i k)
              0
              (/ (n i) (+ (d i) (cont-frac-range (inc i))))))]
    (cont-frac-range 1)))

(defn golden-ratio []
  (/ 1 (cont-frac (fn [i] 1.0) (fn [i] 1.0) 13)))

(defn cont-frac-i [n d k]
  (let [iter (fn [i result]
               (if (zero? i)
                 result
                 (recur (dec i) (/ (n i) (+ (d i) result)))))]
    (iter k 0)))

(defn golden-ratio-i []
  (/ 1 (cont-frac-i (fn [i] 1.0) (fn [i] 1.0) 13)))

(golden-ratio-i)







