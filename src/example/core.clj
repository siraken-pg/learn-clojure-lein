(ns example.core)

(defn greet [name]
  (println (str name ", hello!")))

(defn -main [& args]
  (println args)
  (greet "siraken"))