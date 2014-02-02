(ns sicp.2-2
  (:require [sicp.core :refer [average]]))

(defn make-segment [start end]
  (list start end))

(defn start-segment [segment]
  (first segment))

(defn end-segment [segment]
  (last segment))

(defn make-point [x y]
  (list x y))

(defn x-point [p]
  (first p))

(defn y-point [p]
  (last p))

(defn midpoint-segment [segment]
  (make-point (average (x-point (start-segment segment))
                       (x-point (end-segment segment)))
              (average (y-point (start-segment segment))
                       (y-point (end-segment segment)))))
