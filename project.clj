(defproject example "0.1.0-SNAPSHOT"
  :description "description"
  :url "http://www.siraken.net"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 ;; https://github.com/clojure/data.json
                 [org.clojure/data.json "2.4.0"]
                 ;; https://github.com/weavejester/compojure
                 [compojure "1.7.0"]
                 ;; https://github.com/dakrone/clj-http
                 [clj-http "3.12.3"]
                 ;; https://github.com/dakrone/cheshire
                 [cheshire "5.11.0"]
                 ;; https://github.com/clojure/java.jdbc
                 [org.clojure/java.jdbc "0.7.12"]
                 ;; MySQL
                 [mysql/mysql-connector-java "8.0.26"]
                 ;; https://github.com/ring-clojure/ring
                 [ring/ring-core "1.9.6"]
                 ;; https://github.com/weavejester/hiccup
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler ring-test.handler/app}
  :repl-options {:init-ns example.core}
  :java-source-paths ["src/my_java"]
  :main example.core)
