(ns sicp.2-29-test
  (:require [midje.sweet :refer :all]
            [sicp.2-29 :refer :all]))

(def branch1 (make-branch 3 4))
(def branch2 (make-branch 2 6))

(def balanced-6 (make-mobile (make-branch 5 4)
                             (make-branch 10 2)))

(def balanced-14 (make-mobile (make-branch 3 (make-mobile (make-branch 9 2)
                                                          (make-branch 2 9)))
                              (make-branch 11 3)))

(def unbalanced-14 (make-mobile (make-branch 3 8)
                                (make-branch 6 balanced-6)))

(facts "left-branch"
  (left-branch (make-mobile branch1 branch2)) => branch1
  )

(facts "right-branch"
  (right-branch (make-mobile branch1 branch2)) => branch2
  )

(facts "branch-length"
  (branch-length (make-branch 3 4)) => 3
  )

(facts "branch-structure"
  (branch-structure (make-branch 3 4)) => 4
  (branch-structure (make-branch 3 (make-mobile branch1 branch2))) =>
  (make-mobile branch1 branch2)
  )

(facts "branch-weight"
  (branch-weight (make-branch 5 4)) => 4
  (branch-weight (make-branch 5 balanced-6)) => 6
  )

(facts "mobile-weight"
  (mobile-weight balanced-6) => 6
  (mobile-weight balanced-14) => 14
  (mobile-weight unbalanced-14) => 14
  )

(facts "balanced?"
  (balanced? balanced-6) => true
  (balanced? balanced-14) => true
  (balanced? unbalanced-14) => false
  (balanced? (make-mobile (make-branch 3 balanced-14)
                          (make-branch 3 unbalanced-14))) => false
                          (balanced? (make-mobile (make-branch 3 unbalanced-14)
                                                  (make-branch 3 balanced-14)))
  => false
  )
