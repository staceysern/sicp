(ns sicp.cons)

(defn make-cons-cell [car cdr]
  (atom [car cdr]))

(defn pair? [v]
  (if (instance? clojure.lang.Atom v)
    (= (count @v) 2)
    false))

(defn make-list
  ([] (make-cons-cell nil nil))
  ([first & rest]
     (let [ar (if (sequential? first)
                  (apply make-list first)
                  first)
           dr (if (seq rest)
                (apply make-list rest)
                rest)]
       (make-cons-cell ar dr))))

(defn car [!cell]
  (first @!cell))

(defn cdr [!cell]
  (first (rest @!cell)))

(defn set-car! [!record value]
  (swap! !record (fn [record] [value (cdr !record)])))

(defn set-cdr! [!record value]
  (swap! !record (fn [record] [(car !record) value])))

(defn cons-flatten [v]
  (if (pair? v)
    (vector (cons-flatten (car v)) (cons-flatten (cdr v)))
    v))
