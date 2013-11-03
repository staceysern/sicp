(ns sicp.1-41-test
  (:require [midje.sweet :refer :all]
            [sicp.1-41 :refer :all]))

(facts "dubble"
       ((dubble inc) 5) => 7
       )

(facts "dubble dubble"
       (((dubble (dubble dubble)) inc) 5) => 21
       )


          
