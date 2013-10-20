(ns sicp.bench
  (:use criterium.core))

(defn benchmk [f ns]
  (if-not (empty? ns)
    (do
      (println (first ns))
      (bench (f (first ns)))
      (recur f (rest ns)))))
