(ns coin-changer.core)

(def coin-type-and-value
  {:quarter 25 :dime 10 :nickel 5 :penny 1})

(defn coin-value
  [coin-type]
  (get coin-type-and-value coin-type))

(defn make-change?
  [coin-type remaining-change]
  (if (< (coin-value coin-type) remaining-change) true false))

; (defn coin-changer
;   [change-left current-coin-type]
;   (if (> change-left 0 )
;     (if (> current-denomination change-left))))
