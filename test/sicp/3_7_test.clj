(ns sicp.3-7-test
  (:require [midje.sweet :refer :all]
            [sicp.3-7 :refer :all]
            [sicp.3-3 :refer [make-account]]))

(facts "make-joint"
  (let [account (make-account 100 :account-pwd)
        joint (make-joint account :account-pwd :joint-pwd)]
    ((joint :joint-pwd :withdraw) 30) => 70
    ((account :account-pwd :withdraw) 10) => 60
    ((joint :joint-pwd :deposit) 20) => 80
    ((joint :account-pwd :deposit) 30) => "Incorrect password"
    ((account :joint-pwd :withdraw) 10) => "Incorrect password"
    (make-joint account :password :joint-pwd) => (throws Exception))
  )
