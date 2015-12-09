(ns coin-changer.core)
(defn amount-of-quarters
  [pennies]
  (int (Math/floor (/ pennies 25))))

(defn amount-of-dimes
  [pennies]
  (int (Math/floor (/ pennies 10))))

(defn amount-of-nickels
  [pennies]
  (int (Math/floor (/ pennies 5))))

(defn pennies-after-finding-quarters
  [pennies]
  (- pennies (* 25 (amount-of-quarters pennies))))

(defn pennies-after-finding-dimes
  [pennies]
  (- pennies (* 10 (amount-of-dimes pennies))))

(defn pennies-after-finding-nickels
  [pennies]
  (- pennies (* 5 (amount-of-nickels pennies))))

(defn change-coins
  [pennies]
  (str
    (amount-of-quarters pennies) " quarter(s) "
    (amount-of-dimes (pennies-after-finding-quarters pennies)) " dime(s) "
    (amount-of-nickels (pennies-after-finding-dimes (pennies-after-finding-quarters pennies)))" nickel(s)"))
