(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coins"

  (it "should give me a list of coins"
    (should= {:quarter 25 :dime 10 :nickel 5 :penny 1} coin-type-and-value)))

(describe "make-change?"
  (it "returns true if coin denomination is greater than change left"
    (should (make-change? :quarter 26))))

(run-specs)
