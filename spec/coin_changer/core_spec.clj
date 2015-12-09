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

(describe "amount-of-nickels"
  (it "takes 9 cents and returns 1"
    (should= 1 (amount-of-nickels 9))))

(describe "pennies-after-finding-quarters"

  (it "takes 26 cents and return 1"
    (should= 1 (pennies-after-finding-quarters 26))))

(describe "pennies-after-finding-dimes"
  (it "takes 17 cents and return 7"
    (should= 7 (pennies-after-finding-dimes 17))))

(describe "change-coins"

  (it "takes 35 cents and returns 1 quarter 1 dime"
    (should= "1 quarter(s) 1 dime(s) 0 nickel(s)" (change-coins 35)))

  (it "takes 40 cents and returns 1 quarter 1 dime and 1 nickel"
    (should= "1 quarter(s) 1 dime(s) 1 nickel(s)" (change-coins 40))))


(run-specs)
