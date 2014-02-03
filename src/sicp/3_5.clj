(ns sicp.3-5
  (:require [sicp.core :refer [gcd]]
            [clojure.math.numeric-tower :as math]))

(defn monte-carlo [trials experiment]
  (loop [trials-remaining trials
         trials-passed 0]
     (cond (zero? trials-remaining) (/ trials-passed trials)
          (experiment) (recur (dec trials-remaining) (inc trials-passed))
          :else (recur (dec trials-remaining) trials-passed))))

(defn cesaro-test []
  (= (gcd (rand-int 1000) (rand-int 1000)) 1))

(defn estimate-pi [trials]
  (math/sqrt (/ 6 (monte-carlo trials cesaro-test))))

(defn random-in-range [low high]
  (+ low (rand (- high low))))

(defn area [x1 x2 y1 y2]
  (* (- x2 x1) (- y2 y1)))

(defn estimate-integral [P x1 x2 y1 y2 trials]
  (* (area x1 x2 y1 y2)
     (monte-carlo trials (fn [] (P (random-in-range x1 x2)
                                  (random-in-range y1 y2))))))
