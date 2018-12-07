(ns user
  (:require [org-browser.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [org-browser.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'org-browser.core/repl-server))

(defn stop []
  (mount/stop-except #'org-browser.core/repl-server))

(defn restart []
  (stop)
  (start))


