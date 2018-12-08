(ns org-browser.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [org-browser.core-test]))

(doo-tests 'org-browser.core-test)

