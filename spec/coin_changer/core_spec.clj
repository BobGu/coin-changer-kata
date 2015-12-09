(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "amount-of-quarters"

  (it "can take 25 cents and return 1"
    (should= 1 (amount-of-quarters 25))))

(describe "amount-of-dimes"

  (it "can take 20 cents and return 2"
    (should= 2 (amount-of-dimes 20))))

(run-specs)
