(ns sicp.1-5)

;; With applicative order, the call will never return because the (p)
;; parameter will be evaluated to (p) which will repeatedly need to be evaluated

;; applicative order:
;;
;; (test 0 (p))
;; (test 0 (p))
;; (test 0 (p))

;; normative order:
;;
;; (test 0 (p))
;; (if (= 0 0) 0 (p))
;; (if #t 0 (p))
;; 0

