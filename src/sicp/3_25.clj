(ns sicp.3-25
  (:refer-clojure :exclude [assoc])
  (:require [sicp.cons :refer [make-cons-cell make-list car cdr set-cdr!]]))

(defn assoc [key records]
  (cond (nil? records) false
        (= key (car (car records))) (car records)
        :else (recur key (cdr records))))

(defn make-table []
  (make-list :table))

(defn lookup [table key & keys]
  (let [record (assoc key (cdr table))]
    (if record
      (if (nil? keys)
        (cdr record)
        (apply lookup record keys))
      false)))

(defn insert! [table value key & keys]
  (let [record (assoc key (cdr table))]
    (if record
      (if (nil? keys)
        (set-cdr! record value)
        (apply insert! record value keys))
      (if (nil? keys)
        (set-cdr! table (make-cons-cell
                         (make-cons-cell key value)
                         (cdr table)))
        (do
          (set-cdr! table (make-cons-cell
                           (make-cons-cell key nil)
                           (cdr table)))
          (apply insert! table value key keys)))))
  table)
