(ns sicp.accumulate)

(defn accumulate [op initial sequence]
  (if-not (seq sequence)
    initial
    (op (first sequence) (accumulate op initial (rest sequence)))))


