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

(defn change-after-finding-quarters
  [change]
  (- change (* 25 (amount-of-quarters change))))

(defn change-after-finding-dimes
  [change]
  (- change (* 10 (amount-of-dimes change))))

(defn change-after-finding-nickels
  [change]
  (- change (* 5 (amount-of-nickels change))))

(defn remaining-pennies
  [pennies]
  (change-after-finding-nickels pennies))

(defn change-coins
  [pennies]
  (str
    (amount-of-quarters pennies) " quarter(s) "
    (amount-of-dimes (change-after-finding-quarters pennies)) " dime(s) "
    (amount-of-nickels (change-after-finding-dimes (change-after-finding-quarters pennies)))" nickel(s) "
    (remaining-pennies pennies) " pennies"))
