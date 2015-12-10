(ns coin-changer.core)

(def coin-type-and-value
  {:quarter 25 :dime 10 :nickel 5 :penny 1})

(def coin-types
  (keys coin-type-and-value))

(defn make-change?
  [coin-type remaining-change]
  (if (<= (coin-type coin-type-and-value) remaining-change) true false))

(defn pretty-print
  [coin-type-and-quantity]
  (doseq [[k v] coin-type-and-quantity]
    (print v (str (clojure.string/replace k #":" "") "(s) "))
    ))

(defn coin-changer
  [change-left current-coin-type coin-type-and-quantity]
  (if (> change-left 0)
    (if (make-change? current-coin-type change-left)
      (coin-changer
        (- change-left (current-coin-type coin-type-and-value))
        current-coin-type
        (assoc
          coin-type-and-quantity
          current-coin-type
          (inc (current-coin-type coin-type-and-quantity))))
      (coin-changer
        change-left
        (nth coin-types (inc (.indexOf coin-types current-coin-type)))
        coin-type-and-quantity))
  (pretty-print coin-type-and-quantity)))
