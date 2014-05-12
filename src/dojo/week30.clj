(ns dojo.week30
  (:gen-class))

(defn write-json [object]
  (cond
    (nil? object) "null"
    (true? object) "true"
    (false? object) "false"
    (keyword? object) (pr-str(name object))
    (vector? object) (str "[" (clojure.string/join "," (map write-json object)) "]")
    (map? object) (map write-json object)
    :else (pr-str object)
    )

  )
