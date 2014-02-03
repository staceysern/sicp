(ns sicp.3-4-test
  (:require [midje.sweet :refer :all]
            [sicp.3-4 :refer :all]))

(facts "make-account"
  (let [account (make-account 100 :secret-password)]
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "The police have been called")

  (let [account (make-account 100 :secret-password)]
    ((account :secret-password :withdraw) 30) => 70
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :secret-password :deposit) 20) => 90
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "Incorrect password"
    ((account :wrong-password :withdraw) 30) => "The police have been called"
    ((account :secret-password :withdraw) 30) => "The police have been called")
  )
