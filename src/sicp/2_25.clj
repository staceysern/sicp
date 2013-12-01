(ns sicp.2-25)

(first (rest (first (rest (rest '(1 3 (5 7) 9))))))  ;; cadaddr

(first (first '((7)))) ;; caar

(first
 (rest
  (first
   (rest
    (first
     (rest
      (first
       (rest
        (first
         (rest
          (first
           (rest
            '(1 (2 (3 (4 (5 (6 7))))))))))))))))))  ;; cadadadadadadr
