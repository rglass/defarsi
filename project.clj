(defproject farsi-trans "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/rglass/defarsi"
  :license {:name "GPLv3"
            :url "http://www.gnu.org/licenses/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1934"]
                 [domina "1.0.2"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "0.3.4"]]
  :cljsbuild {:builds[{:source-paths ["src/cljs"],
                       :compiler {:output-to "resources/public/defarsi.js"
                                  :optimizations :advanced}}]}
)
