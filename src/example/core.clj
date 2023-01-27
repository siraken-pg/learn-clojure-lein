(ns example.core
  (:import my_java.Greeting))

(defn greet [name]
  (println (str "Hello, " name "!")))

(defn get-name [args]
  (if (empty? args)
    "John Doe"
    (nth args 0)))

(defn -main [& args]
  (println "arguments:" args "\n")
  (greet (get-name args))
  (println (Greeting/hello)))
