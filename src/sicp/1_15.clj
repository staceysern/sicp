(ns sicp.1-15
  (:require [sicp.core :refer [cube]]))

(defn p [x]
  (- (* 3 x)
     (* 4 (cube x))))

(defn sine [angle]
  (if (not (> (Math/abs angle) 0.1))
    angle
    (p (sine (/ angle 3.0)))))

(sine 12.15)

;; a. 5
;; b. Space and time order of growth: theta(log base 3 angle)
