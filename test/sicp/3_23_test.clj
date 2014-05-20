(ns sicp.3-23-test
  (:require [midje.sweet :refer :all]
            [sicp.3-23 :refer :all]
            [sicp.cons :refer [cons-flatten]]))

(facts "deque"
  (let [deque (make-deque)]
    (empty-deque? deque) => true

    (front-insert-deque! deque 5)
    (empty-deque? deque) => false

    (front-insert-deque! deque 4)
    (front-insert-deque! deque 3)
    (rear-insert-deque! deque 6)
    (rear-insert-deque! deque 7)

    (items-forward deque) => [3 4 5 6 7]
    (items-reverse deque) => [7 6 5 4 3]

    (rear-delete-deque! deque)
    (items-forward deque) => [3 4 5 6]

    (front-delete-deque! deque)
    (items-forward deque) => [4 5 6]

    (empty-deque? deque) => false
    (front-delete-deque! deque)
    (front-delete-deque! deque)
    (front-delete-deque! deque)
    (empty-deque? deque) => true

    (front-delete-deque! deque) => (throws Exception)
    (rear-delete-deque! deque) => (throws Exception)

    (items-reverse deque) => []
    (items-forward deque) => []
    )
  )
