(ns sicp.3-23
  (:require [sicp.cons :refer [make-cons-cell car cdr]]))

;; The deque is represented as a pair which refers to the first and
;; last elements of the deque.  Each element consists of a pair of the
;; item and a pair which refers to the previous and the next element in
;; the deque.

(defn make-deque []
  (atom (make-cons-cell nil nil)))

(defn empty-deque? [!deque]
  (nil? (car @!deque)))

(defn front-deque [!deque]
  (car @!deque))

(defn rear-deque [!deque]
  (cdr @!deque))

(defn front-insert-deque! [!deque item]
  (let [old-front (front-deque !deque)
        new-front (make-cons-cell item (atom (make-cons-cell nil old-front)))]
    (if (empty-deque? !deque)
      (swap! !deque (fn [deque] (make-cons-cell new-front new-front)))
      (do
        (swap! !deque (fn [deque] (make-cons-cell new-front (cdr deque))))
        (swap! (cdr old-front) (fn [ptrs] (make-cons-cell new-front (cdr ptrs)))))))
    !deque)

(defn rear-insert-deque! [!deque item]
  (let [old-rear (rear-deque !deque)
        new-rear (make-cons-cell item (atom (make-cons-cell old-rear nil)))]
    (if (empty-deque? !deque)
      (swap! !deque (fn [deque] (make-cons-cell new-rear new-rear)))
      (do
        (swap! (cdr old-rear) (fn [ptrs] (make-cons-cell (car ptrs) new-rear)))
        (swap! !deque (fn [deque] (make-cons-cell (car deque) new-rear))))))
  !deque)

(defn front-delete-deque! [!deque]
  (if (empty-deque? !deque)
    (throw (Exception. "Can't delete from empty deque.")))
  (let [new-front (cdr @(cdr (front-deque !deque)))]
    (if (nil? new-front)
      (swap! !deque (fn [deque] (make-cons-cell nil nil)))
      (do
        (swap! !deque (fn [deque] (make-cons-cell new-front (rear-deque !deque))))
        (swap! (cdr new-front) (fn [ptrs] (make-cons-cell nil (cdr ptrs)))))))
    !deque)

(defn rear-delete-deque! [!deque]
  (if (empty-deque? !deque)
    (throw (Exception. "Can't delete from empty deque.")))
  (let [new-rear (car @(cdr (rear-deque !deque)))]
    (if (nil? new-rear)
      (swap! !deque (fn [deque] (make-cons-cell nil nil)))
      (do
        (swap! !deque (fn [deque] (make-cons-cell (front-deque !deque) new-rear)))
        (swap! (cdr new-rear) (fn [ptrs] (make-cons-cell (car ptrs) nil))))))
  !deque)

(defn items-forward [!deque]
  (loop [ptr (front-deque !deque)
         items []]
    (if (not (nil? ptr))
      (recur (cdr @(cdr ptr)) (conj items (car ptr)))
      items)))

(defn items-reverse [!deque]
  (loop [ptr (rear-deque !deque)
         items []]
    (if (not (nil? ptr))
      (recur (car @(cdr ptr)) (conj items (car ptr)))
      items)))
