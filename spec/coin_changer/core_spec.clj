(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coins"
  (it "should give me a list of coins"
    (should= {:quarter 25 :dime 10 :nickel 5 :penny 1} coin-type-and-value)))

(describe "make-change?"
  (it "returns true if coin denomination is greater than change left"
    (should (make-change? :quarter 26))))

(describe "coin-changer"
  (around [it]
    (with-out-str (it)))

  (it "prints 1 quarter when given 25 cents"
    (should= "1 quarter(s) 0 dime(s) 0 nickel(s) 0 penny(s) "
    (with-out-str (coin-changer 25 :quarter {:quarter 0 :dime 0 :nickel 0 :penny 0}))))

  (it "prints 1 quarter and 1 dime given 35 cents"
    (should= "1 quarter(s) 1 dime(s) 0 nickel(s) 0 penny(s) "
    (with-out-str (coin-changer 35 :quarter {:quarter 0 :dime 0 :nickel 0 :penny 0}))))

  (it "prints 3 quarters 1 dimes 0 nickel and 4 pennies given 94 cents"
    (should= "3 quarter(s) 1 dime(s) 1 nickel(s) 4 penny(s) "
    (with-out-str (coin-changer 94 :quarter {:quarter 0 :dime 0 :nickel 0 :penny 0}))))

  (it "tail recursion using a lot of change"
    (should= "400000 quarter(s) 0 dime(s) 0 nickel(s) 0 penny(s) "
    (with-out-str (coin-changer 10000000 :quarter {:quarter 0 :dime 0 :nickel 0 :penny 0})))))

(describe "pretty-print"
  (around [it]
    (with-out-str (it)))

  (it "should print the type of coin and quantity in a purrrty format"
    (should= "1 quarter(s) 0 dime(s) 0 nickel(s) 0 penny(s) "
    (with-out-str (pretty-print {:quarter 1 :dime 0 :nickel 0 :penny 0})))))

(run-specs)
