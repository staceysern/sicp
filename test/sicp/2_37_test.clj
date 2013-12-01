()(ns sicp.2-37-test
  (:require [midje.sweet :refer :all]
            [sicp.2-37 :refer :all]))

(def hmatrix '((1 2 3) (4 5 6)))
(def vmatrix '((7 8) (9 10) (11 12)))
(def vect '(5 4 3))

(facts "dot-product"
       (dot-product (first hmatrix) vect) => 22
       )

(facts "matrix-*-vector"
       (matrix-*-vector hmatrix vect) => '(22 58)
       )

(facts "transpose"
       (transpose hmatrix) => '((1 4) (2 5) (3 6))
       (transpose vmatrix) => '((7 9 11) (8 10 12))
       )

(facts "matrix-*-matrix"
       (matrix-*-matrix hmatrix vmatrix) => '((58 64) (139 154))
       )




