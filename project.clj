(defproject hello-ring "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler hello-ring.core2/handler}
  :dependencies [[org.clojure/clojure "1.8.0"]
                  [ring/ring-core "1.2.1"]
                  [ring/ring-jetty-adapter "1.2.1"]]
  :main hello-ring.core)
