(ns sicp.1-34
  (:use sicp.core))

(defn f [g]
  (g 2))

(f square)

(f (fn [z] (* z (+ z 1))))

;; (f f)
;; (f 2)
;; (2 2) -> exception
