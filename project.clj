(defproject hedgehog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [quil "2.2.6"]
                 [overtone "0.9.1"]]
  :main hedgehog
  .core
  :profiles {:dev {
            :plugins [[cider/cider-nrepl "0.10.0-SNAPSHOT"]]
            :dependencies [[org.clojure/tools.nrepl "0.2.7"]]}})
