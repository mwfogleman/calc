(ns calc.core
  (:gen-class))

(defn parse-op
  "Takes a string of +, -, *, or / and returns its equivalent function."
  [op]
  (let [[p m t d] (map str ['+ '- '* '/])]
    (condp = op
      p +
      m -
      t *
      d /)))

(defn -main
  "A simple infix calculator."
  [a op b]
  (let [op'     (parse-op op)
        [a' b'] (map read-string [a b])]
    (prn (op' a' b'))))
