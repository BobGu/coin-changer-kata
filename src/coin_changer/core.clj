(ns coin-changer.core)
(defn amount-of-quarters
  [pennies]
  (int (Math/floor (/ pennies 25))))

(defn amount-of-dimes
  [pennies]
  (int (Math/floor (/ pennies 10))))
