(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "amount-of-quarters"

  (it "take 25 cents and return 1"
    (should= 1 (amount-of-quarters 25)))

  (it "takes 24 cents and return 0"
    (should= 0 (amount-of-quarters 24))))

(describe "amount-of-dimes"

  (it "takes 20 cents and return 2"
    (should= 2 (amount-of-dimes 20)))

  (it "takes 19 cents and return 1"
    (should= 1 (amount-of-dimes 19)))

  (it "takes 9 cents and return 0"
    (should= 0 (amount-of-dimes 9))))

(describe "pennies-after-finding-quarters"

  (it "takes 26 cents and return 1"
    (should= 1 (pennies-after-finding-quarters 26))))

(run-specs)
