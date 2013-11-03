(ns sicp.2-6)

;; zero appplications of f
(def zero (fn [f] (fn [x] x)))

;; one additional application of f to (n f)
(defn add-1 [n]
  (fn [f] (fn [x] (f ((n f) x)))))

;; (add-1 zero)
;; (fn [f] (fn [x] (f ((zero f) x))))
;; (fn [f] (fn [x] (f ((fn [y] y) x))))
;; (fn [f] (fn [x] (f x)))

(def one (fn [f] (fn [x] (f x))))

(def two (fn [f] (fn [x] (f (f x)))))

(defn add [a b]
  (fn [f] (fn [x] ((a f) ((b f) x)))))



