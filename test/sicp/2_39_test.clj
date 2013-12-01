()(ns sicp.2-39-test
  (:require [midje.sweet :refer :all]
            [sicp.2-39 :refer :all]))

(facts "reverse-r"
       (reverse-r '(1 2 3)) => '(3 2 1)
       (reverse-r ()) => ()
       )

(facts "reverse-l"
       (reverse-l '(1 2 3)) => '(3 2 1)
       (reverse-l ()) => ()
       )




