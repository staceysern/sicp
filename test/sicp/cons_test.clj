(ns sicp.cons-test
  (:require [midje.sweet :refer :all]
            [sicp.cons :refer :all]))

(facts "cons"
  (cons-flatten (make-cons-cell 3 4)) => [3 4]
  (cons-flatten (make-cons-cell 3 (make-cons-cell 4 5))) => [3 [4 5]]
  )

(facts "list"
  (cons-flatten (make-list)) => [nil nil]
  (cons-flatten (make-list 1)) => [1 nil]
  (cons-flatten (make-list 1 2)) => [1 [2 nil]]
  (cons-flatten (make-list '() 1)) => [[nil nil] [1 nil]]
  (cons-flatten (make-list '(1 2) 3 4)) => [[1 [2 nil]] [3 [4 nil]]]
  )

(facts "car"
  (car (make-cons-cell 3 4)) => 3
  (car (make-cons-cell 3 (make-cons-cell 4 5))) => 3
  (car (make-list 3 4)) => 3
  )

(facts "cdr"
  (cons-flatten (cdr (make-cons-cell 3 4))) => 4
  (cons-flatten (cdr (make-cons-cell 3 (make-cons-cell 4 5)))) => [4 5]
  (cons-flatten (cdr (make-list 3 4))) => [4 nil]
  )
