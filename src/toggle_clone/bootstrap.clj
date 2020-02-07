(ns toggle-clone.bootstrap
  (:use ring.adapter.jetty
        toggle-clone.core))


(defonce server (run-jetty #'handler {:port 8080 :join? false}))
