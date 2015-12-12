(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coin-changer"
  (it "returns [0 0 0 0] when given 0 cents"
    (should= [0 0 0 0] (coin-changer 0)))

  (it "returns [0 0 0 1] when give 1 cent"
    (should= [0 0 0 1] (coin-changer 1)))

  (it "returns [0 0 1 0] when given 5 cents"
    (should= [0 0 1 0] (coin-changer 5)))

  (it "returns [0 1 0 0] when given 5 cents"
    (should= [0 1 0 0] (coin-changer 10)))

  (it "returns [1 0 0 0] when given 5 cents"
    (should= [1 0 0 0] (coin-changer 25)))

  (it "returns [1 1 1 1] when given 41 cents"
    (should= [1 1 1 1] (coin-changer 41)))

  (it "returns [4000 0 0 0] when given 100,000 cents"
    (should= [4000 0 0 0] (coin-changer 100000)))

  (it "returns crazy high numbers when given cents"
    (should= [0 0 0 0] (coin-changer 1829482982))))

(run-specs)
