(ns sicp.3-3-test
  (:require [midje.sweet :refer :all]
            [sicp.3-3 :refer :all]))

(facts "make-account"
  (let [account (make-account 100 :secret-password)]
    ((account :secret-password :withdraw) 40) => 60
    ((account :secret-password :deposit) 30) => 90
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :secret-password :deposit) 20) => 110)
  )
