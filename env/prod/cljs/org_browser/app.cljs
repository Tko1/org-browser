(ns org-browser.app
  (:require [org-browser.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
