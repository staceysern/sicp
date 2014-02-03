(ns sicp.1-12)

;; T(r, 1) = T(r, r) = 1
;; T(r, c) = T(r-1, c-1) + T(r-1, c) for 1 < c < r

(defn cell [r c]
  (if (or (= c 1) (= r c))
    1
    (+ (cell (- r 1) (- c 1)) (cell (- r 1) c))))

(defn row [row]
  (loop [c 1 acc []]
    (if (> c row)
      acc
      (recur (+ c 1) (conj acc (cell row c))))))

(defn triangle [rows]
  (loop [r 1 acc []]
    (if (> r rows)
      acc
      (recur (+ r 1) (conj acc (row r))))))
