(ns coin-changer.core)

(def coin-type-and-value
  {:quarter 25 :dime 10 :nickel 5 :penny 1})

(defn make-change?
  [coin-type remaining-change]
  (if (< (coin-type coin-type-and-value) remaining-change) true false))
