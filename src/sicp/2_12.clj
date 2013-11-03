(ns sicp.2-12
  (:use sicp.interval)
  (:use sicp.2-7))

(defn make-center-width [c w]
  (make-interval (- c w) (+ c w)))

(defn center [i]
  (/ (+ (lower-bound i) (upper-bound i)) 2))

(defn width [i]
  (/ (- (upper-bound i) (lower-bound i)) 2))

(defn percent [i]
  (* 100 (/ (width i) (center i))))

(defn make-center-percent [c p]
  (make-center-width c (* c (/ p 100))))
