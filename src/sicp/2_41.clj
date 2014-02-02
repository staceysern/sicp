(ns sicp.2-41
  (:require [sicp.fold :refer [flatmap]]
            [sicp.accumulate :refer [accumulate]]
            [sicp.2-40 :refer [unique-pairs]]))

(defn unique-triples [n]
  (flatmap (fn [[i j]]
             (map (fn [k] (list i j k))
                  (range 1 j)))
           (unique-pairs n)))

(defn triple-sum? [n s]
  (filter (fn [t] (= (accumulate + 0 t) s))
          (unique-triples n)))
