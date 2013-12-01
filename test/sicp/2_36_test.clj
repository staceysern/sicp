()(ns sicp.2-36-test
  (:require [midje.sweet :refer :all]
            [sicp.2-36 :refer :all]))

(facts "accumulate-n"
       (accumulate-n + 0 '((1 2 3) (4 5 6) (7 8 9) (10 11 12))) => '(22 26 30)
       (accumulate-n + 0 '()) => '()
       )




