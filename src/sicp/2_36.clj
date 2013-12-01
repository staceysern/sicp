(ns sicp.2-36
  (:use sicp.accumulate))

(defn accumulate-n [op init seqs]
  (if-not (seq (first seqs))
    ()
    (cons (accumulate op init (map first seqs))
          (accumulate-n op init (map rest seqs)))))



 
