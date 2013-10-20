(ns sicp.1-20)

;; Normal order: (18 remainder operations)
;; (gcd 206 40)
;; (if (= 40 0)
;;   206
;;   (gcd 40 (remainder 206 40)))
;; (if #f
;;     206
;;     (gcd 40 (remainder 206 40)))

;; (gcd 40 (remainder 206 40))
;; (if (= (remainder 206 40) 0)                                  ;; 1
;;     40
;;     (gcd (remainder 206 40)
;;          (remainder 40 (remainder 206 40))))
;; (if (= 6 0) ...                 
;; (if #f ..

;; (gcd (remainder 206 40)
;;      (remainder 40 (remainder 206 40)))                       
;; (if (= (remainder 40 (remainder 206 40)) 0)                   ;; 2
;;     (remainder 206 40)
;;     (gcd (remainder 40 (remainder 206 40))
;;          (remainder (remainder 206 40)
;;                     (remainder 40 (remainder 206 40)))))
;; (if (= (remainder 40 6) 0) ...  
;; (if (= 4 0) ...                
;; (if #f ...

;; (gcd (remainder 40 (remainder 206 4))
;;      (remainder (remainder 206 40)
;;                 (remainder 40 (remainder 206 40))))           
;; (if (= (remainder (remainder 206 40)
;;                   (remainder 40 (remainder 206 40))))        ;; 4
;;     (remainder 40 (remainder 206 40))
;;     (gcd (remainder (remainder 206 40)
;;                     (remainder 40 (remainder 206 40)))
;;          (remainder (remainder 40 (remainder 206 40))
;;                     (remainder (remainder 206 40)
;;                                (remainder 40
;;                                           (remainder 206 40))))))

;; (gcd (remainder (remainder 206 40)
;;                 (remainder 40 (remainder 206 40)))
;;      (remainder (remainder 40 (remainder 206 40))
;;                 (remainder (remainder 206 40)
;;                            (remainder 40
;;                                       (remainder 206 40)))))
;; (if (= (remainder (remainder 40 (remainder 206 40))          ;; 7
;;                   (remainder (remainder 206 40)
;;                              (remainder 40
;;                                         (remainder 206 40)))) 0)
;;     (remainder (remainder 206 40)
;;                (remainder 40 (remainder 206 40)))            ;; 4
;;     (gcd ...)

;; Applicative order (4 remainder operations)
;; (gcd 206 40)
;; (if (= 40 0) 206 (gcd 40 (remainder 206 40)))
;; (gcd 40 (remainder 206 40))
;; (gcd 40 6)
;; (if (= 6 0) 40 (gcd 6 (remainder 40 6)))
;; (gcd 6 (remainder 40 6))
;; (gcd 6 4)
;; (if (= 4 0) 6 (gcd 4 (remainder 6 4)))
;; (gcd 4 (remainder 6 4))
;; (gcd 4 2)
;; (if (= 2 0) 4 (gcd 2 (remainder 4 2)))
;; (gcd 2 (remainder 4 2))
;; (gcd 2 0)
;; (if (= 0 0) 2 (gcd 0 (remainder 2 0)))
;; 2


