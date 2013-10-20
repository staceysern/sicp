(ns sicp.1-8
  (:use sicp.core))

(defn cuberoot [x]
  (letfn [(improve [guess x]
            (/ (+ (/ x (square guess)) (* guess 2))
               3))
          
          (good-enough? [guess x]
            (< (Math/abs (- (cube guess) x)) 0.001))
          
          (iter [guess x]
            (if (good-enough? guess x)
              guess
              (iter (improve guess x) x)))]
    
    (iter 1.0 x)))
