(ns sicp.1-34
  (:require [sicp.core :refer [square]]))

(defn f [g]
  (g 2))

(f square)

(f (fn [z] (* z (+ z 1))))

;; (f f)
;; (f 2)
;; (2 2) -> exception
