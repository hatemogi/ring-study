(defproject ring-study "0.1.0-SNAPSHOT"
  :description "클로저 Ring 학습"
  :url "https://github.com/hatemogi/ring-study"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]]
  :main ^:skip-aot ring-study.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
