(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coins"

  (it "should give me a list of coins"
    (should= ["quarter" "dime" "nickel" "penny"] coin-types)))


(run-specs)
