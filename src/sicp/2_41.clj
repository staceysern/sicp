(ns sicp.2-41
  (:use sicp.fold)
  (:use sicp.accumulate)
  (:use sicp.2-40))

(defn unique-triples [n]
  (flatmap (fn [[i j]]
             (map (fn [k] (list i j k))
                  (range 1 j)))
           (unique-pairs n)))

(defn triple-sum? [n s]
  (filter (fn [t] (= (accumulate + 0 t) s))
          (unique-triples n)))
