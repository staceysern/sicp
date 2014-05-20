(ns sicp.3-24
  (:require [sicp.cons :refer [make-cons-cell car make-list cdr set-cdr!]]))

(defn make-table [same-key?]
  (let [local-table (make-list :table)
        assoc (fn [key records]
                (cond (nil? records) false
                      (same-key? key (car (car records))) (car records)
                      :else (recur key (cdr records))))
        lookup (fn [key-1 key-2]
                 (let [subtable (assoc key-1 (cdr local-table))]
                   (if subtable
                     (let [record (assoc key-2 (cdr subtable))]
                       (if record
                         (cdr record)
                         false))
                     false)))
        insert! (fn [key-1 key-2 value]
                  (let [subtable (assoc key-1 (cdr local-table))]
                    (if subtable
                      (let [record (assoc key-2 (cdr subtable))]
                        (if record
                          (set-cdr! record value)
                          (set-cdr! subtable
                                    (make-cons-cell (make-cons-cell key-2 value)
                                                    (cdr subtable)))))
                      (set-cdr! local-table
                                (make-cons-cell (make-list
                                                 key-1
                                                 (make-cons-cell key-2 value))
                                                (cdr local-table)))))
                  :ok)
        dispatch (fn [m]
                   (cond (= m :lookup-proc) lookup
                         (= m :insert-proc!) insert!
                         :else (throw (Exception. "Unknown operation"))))]
    dispatch))
