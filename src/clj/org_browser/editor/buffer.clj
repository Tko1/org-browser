(ns org-browser.editor.buffer)

(defn new-buffer []
  {:types [:Buffer] :text ""})

(defn insert-buffer [buffer text]
  (update buffer :text #(str % text)))

(defn delete-region [buffer start end]
  (update
   buffer :text
   #(-> (new StringBuilder %)
        (.delete start end)
        (.toString))))
