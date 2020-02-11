(ns toggle-clone.core
  (:use ring.util.response))
(defn handler [request]
  (->
    (response
      (let [path (get request :uri)]                        ; so that's the solution for creating variables
        (cond                                               ; inside function
          (= path "/") (str "{\"requestPath\": \"" 1 "\"}")
          (= path "/test") (str "{\"Hello\": \"World\"}")
          (= path "/test1") (str "{\"Hello\": \"World1\"}")
          :else (str "{\"NOT\": \"MATCHED\"}")
          ))
      )


    (content-type "application/json"))
  )



