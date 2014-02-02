(ns sicp.2-14
  (:require [sicp.interval :refer [make-interval div-interval mul-interval
                                   add-interval]]
            [sicp.2-12 :refer [make-center-percent percent]]))

(defn par1 [r1 r2]
  (div-interval (mul-interval r1 r2)
                (add-interval r1 r2)))

(defn par2 [r1 r2]
  (let [one (make-interval 1 1)]
    (div-interval one
                  (add-interval (div-interval one r1)
                                (div-interval one r2)))))

(def a (make-center-percent 50 1))
(def b (make-center-percent 25 1))

(div-interval a a)
;; (0.9801980198019802 1.0202020202020203)

(div-interval a b)
;;(1.9603960396039604 2.0404040404040407)

(percent (par1 a b))
;; 2.999200239928013

(percent (par2 a b))
;; 1.0000000000000069
