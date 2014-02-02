(defproject sicp "0.1.0-SNAPSHOT"
  :description "SICP Solutions"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [midje "1.5.1"]
                 [criterium "0.4.2"]
                 [org.clojure/tools.trace "0.7.6"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
