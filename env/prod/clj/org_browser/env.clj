(ns org-browser.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[org-browser started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[org-browser has shut down successfully]=-"))
   :middleware identity})
