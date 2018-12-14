(ns org-browser.test.editor.buffer
  (:require [org-browser.editor.buffer :as sut]
            [clojure.test :as t]))



(t/deftest insert-buffer-test
  (t/is (= (sut/insert-buffer (sut/new-buffer) "Test text")
         { :types [:Buffer] :text "Test text"})))

(t/deftest buffer-test
  insert-buffer-test)
