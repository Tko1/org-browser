(ns org-browser.editor.buffer
  (:require '[clojure.test :refer :all]))

(defn new-buffer []
  {:types [:Buffer] :text ""})

(defn insert-buffer [buffer text]
  (update buffer :text #(str % text)))


