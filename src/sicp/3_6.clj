(ns sicp.3-6
  (:refer-clojure :exclude [rand])
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn rand-update [x]
  (let [a (Math/pow 2 32)
        c 1103515245
        m 12345]
    (int (mod (+ (* a x) c) m))))

(def rand
  (let [!x (atom 0)
        reset (fn [seed] (swap! !x (fn [x] seed)))
        generate (fn [] (swap! !x (fn [x] (rand-update x))))]
    (fn [action]
      (cond (= action :reset) reset
            (= action :generate) (generate)
            :else (throw (Exception. "Unsupported action"))))))
