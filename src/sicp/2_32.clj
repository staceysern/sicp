(ns sicp.2-32
  (:require [sicp.core :refer [append]]))

(defn subsets [s]
  (if-not (seq s)
    (list ())
    (let [rst (subsets (rest s))]
      (append rst
              (map (fn [x]
                     (list* (first s) x))
                   rst)))))
