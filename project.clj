(defproject sicp "0.1.0-SNAPSHOT"
  :description "SICP Solutions in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [midje "1.5.1"]
                 [criterium "0.4.2"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
