(ns coin-changer.core)
(defn amount-of-quarters
  [pennies]
  (int (Math/floor (/ pennies 25))))

(defn amount-of-dimes
  [pennies]
  (int (Math/floor (/ pennies 10))))

(defn pennies-after-finding-quarters
  [pennies]
  (- pennies (* 25 (amount-of-quarters pennies))))
