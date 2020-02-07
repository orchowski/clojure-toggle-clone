(ns toggle-clone.core
  (:use ring.util.response))
(defn handler [request]
  (->

    ; TODO use a variable to get path
    (response
      (cond
          (= (get request :uri) "/") (str "{\"requestPath\": \"" 1 "\"}")
          (= (get request :uri) "/test") (str "{\"Hello\": \"World\"}")
          (= (get request :uri) "/test1") (str "{\"Hello\": \"World1\"}")
          :else (str "{\"NOT\": \"MATCHED\"}")
          )
      )


    (content-type "application/json"))
  )



