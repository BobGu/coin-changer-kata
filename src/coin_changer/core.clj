(ns coin-changer.core)

(defn make-change?
  [coin-value remaining-change]
  (<= coin-value remaining-change))

(defn pretty-print
  [coin-type-and-quantity]
  (doseq [[k v] coin-type-and-quantity]
    (print v (str (clojure.string/replace k #":" "") "(s) "))
    ))

; (defn coin-changer
;   [change-left current-coin-type coin-type-and-quantity]
;   (if (= change-left 0)
;     (pretty-print coin-type-and-quantity)
;     (if-not (make-change? current-coin-type change-left)
;       (coin-changer
;         change-left
;         (nth coin-types (inc (.indexOf coin-types current-coin-type)))
;         coin-type-and-quantity)
;       (recur
;         (- change-left (current-coin-type coin-type-and-value))
;         current-coin-type
;         (assoc
;           coin-type-and-quantity
;           current-coin-type
;           (inc (current-coin-type coin-type-and-quantity)))))))

(defn coin-changer [change-left]
  (loop [change-left change-left
         coin-denoms [25 10 5 1]
         current-coin-index 0
         coin-quantities [0 0 0 0]]
  (if (= change-left 0)
    coin-quantities
    (let [current-coin-quantity (int (/ change-left (first coin-denoms)))]
      (recur (mod change-left (first coin-denoms))
             (rest coin-denoms)
             (inc current-coin-index)
             (assoc coin-quantities current-coin-index current-coin-quantity))))))
