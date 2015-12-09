(ns coin-changer.core)

(def coin-types
  ["quarter" "dime" "nickel" "penny"])

(defn make-change?
  [coin-size remaining-change]
  (if (< coin-size remaining-change) true false))
