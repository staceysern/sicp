(ns sicp.1-41)

(defn dubble [f]
  (fn [x]
    (f (f x))))


;; (((dubble (dubble dubble)) inc) 5)
;; (((dubble (fn [x] (dubble (dubble x)))) inc) 5)
;; ((fn [x] (dubble (dubble (dubble (dubble [x])))) inc) 5)
;; ((dubble (dubble (dubble (fn [x] (inc (inc [x])))))) 5)
;; ((dubble (dubble (fn [x] (inc (inc (inc (inc [x]))))))) 5)
;; ((dubble (fn [x] (inc (inc (inc (inc (inc (inc (inc (inc [x])))))))))) 5)
;; ((fn [x] (inc (inc (inc (inc (inc (inc (inc (inc
;;         (inc (inc (inc (inc (inc (inc (inc (inc [x]))))))))))))))))))
;; 21

(((dubble (dubble dubble)) inc) 5)

