(ns mysql.main
  (:require [clojure.java.jdbc :as j]))

(def mysql-db {:host "localhost"
               :port 3306
               :dbtype "mysql"
               :dbname "example"
               :user "example"
               :password "example"})

(defn create-users-table []
  (j/execute! mysql-db
              ["
                CREATE TABLE IF NOT EXISTS users (
                id INT NOT NULL AUTO_INCREMENT,
                name VARCHAR(255),
                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                PRIMARY KEY (id)
                )"]))

(defn drop-users-table []
  (j/execute! mysql-db
              ["DROP TABLE IF EXISTS users"]))

(defn insert-user [name]
  (j/execute! mysql-db
              ["INSERT INTO users (name) VALUES (?)" name]))

(defn update-user [id name]
  (j/execute! mysql-db
              ["UPDATE users SET name = ? WHERE id = ?" name id]))

(defn select-user-by-id [id]
  (j/query mysql-db
           ["SELECT * FROM users WHERE id = ?" id]))

(defn -main []
  (drop-users-table)
  (create-users-table)
  (insert-user "John")
  (println (select-user-by-id 1))
  (update-user 1 "Jane")
  (println (select-user-by-id 1)))