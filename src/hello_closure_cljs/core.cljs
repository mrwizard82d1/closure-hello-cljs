(ns ^:figwheel-always hello-closure-cljs.core
    (:require [goog.dom :as dom]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn say-hi []
  (let [new-header 
        (dom/createDom "h1" 
                       #js {:style 
                            #js {:backgroundColor "#eee"}}
                       "Hello Closure World!")]
    (println "Where am I?")
    (dom/appendChild (.-body js/document) new-header)))
