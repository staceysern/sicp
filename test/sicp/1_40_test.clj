(ns sicp.1-40-test
  (:require [midje.sweet :refer :all]
            [sicp.1-40 :refer :all]))

(facts "sqrt"
       (< (Math/abs (- (sqrt 100) 10)) 0.000001) => true
       (< (Math/abs (- (sqrt 25) 5)) 0.000001) => true
       )

(facts "cubic"
       (< ((cubic 3 -8 6) (newtons-method (cubic 3 -8 6) 1)) 0.00000001) => true
       (< ((cubic 4.4 2.9 25) (newtons-method (cubic 4.4 2.9 25) 1)) 0.00000001) => true
       )
          

          
 
