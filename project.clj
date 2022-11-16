(defproject example "0.1.0-SNAPSHOT"
  :description "description"
  :url "http://www.siraken.net"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 ;; https://github.com/dakrone/clj-http
                 [clj-http "3.12.3"]
                 ;; https://github.com/dakrone/cheshire
                 [cheshire "5.11.0"]
                 ;; https://github.com/clojure/java.jdbc
                 [org.clojure/java.jdbc "0.7.12"]
                 ;; MySQL
                 [mysql/mysql-connector-java "8.0.26"]]
  :repl-options {:init-ns example.core}
  :main example.core)
