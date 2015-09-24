(ns hedgehog.core
  (:require [quil.core :as q])
  (:gen-class))

(defn setup []
  (q/smooth)
  (q/frame-rate 1)
  (q/background 200))

(defn draw []
  (q/stroke (q/random 255))
  (q/stroke-weight (q/random 10))
  (q/fill (q/random 355))

  (let [diam (q/random 100)
        x (q/random (q/width))
        y (q/random (q/height))]
    (q/ellipse x y diam diam)))

(q/defsketch ohoho
  :title "Oh my"
  :setup setup
  :draw draw
  :size [400 300])

(defn -main
  [args]
  (println "Starting smth"))
