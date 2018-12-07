(ns org-browser.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [org-browser.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[org-browser started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[org-browser has shut down successfully]=-"))
   :middleware wrap-dev})
