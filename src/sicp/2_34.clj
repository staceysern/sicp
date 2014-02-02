(ns sicp.2-34
  (:require [sicp.accumulate :refer [accumulate]]))

(defn horner-eval [x coefficient-sequence]
  (accumulate (fn [this-coeff higher-terms] (+ this-coeff (* x higher-terms)))
              0
              coefficient-sequence))
