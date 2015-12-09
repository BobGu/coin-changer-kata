(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coin-changer.core"

  (it "can take 25 cents and return a quarter"
    (should= 1 (amount-of-quarters 25)))

)

(run-specs)
