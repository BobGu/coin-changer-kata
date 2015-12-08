(ns coin-changer.core)
(defn change-coins
  [pennies]
  (str (/ pennies 25) " quarter(s)"))
