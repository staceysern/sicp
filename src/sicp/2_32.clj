(ns sicp.2-32
  (use sicp.core))

(defn subsets [s]
  (if-not (seq s)
    (list ())
    (let [rst (subsets (rest s))]
      (append rst
              (map (fn [x]
                     (list* (first s) x))
                   rst)))))
