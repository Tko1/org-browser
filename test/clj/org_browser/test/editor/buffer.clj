(ns org-browser.test.editor.buffer
  (:require [org-browser.editor.buffer :as sut]
            [clojure.test :as t]))



(t/deftest insert-buffer-test
  (t/is (= (sut/insert-buffer (sut/new-buffer) "Test text")
         { :types [:Buffer] :text "Test text"})))

(t/deftest append-text--insert-buffer-test
  (t/is (= (-> (sut/new-buffer)
               (sut/insert-buffer "cat")
               (sut/insert-buffer "dog"))
           { :types [:Buffer] :text "catdog"})))

(t/deftest identity-insert--insert-buffer-test
  (t/is (= (-> (sut/new-buffer)
               (sut/insert-buffer "")
               (sut/insert-buffer "cat")
               (sut/insert-buffer ""))
           { :types [:Buffer] :text "cat"})))
  


(t/deftest buffer-test
  insert-buffer-test)
