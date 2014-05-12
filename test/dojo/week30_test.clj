(ns dojo.week30-test
  (:require [midje.sweet :refer :all]
            [dojo.week30 :refer :all]))

(fact "can write nil to JSON"
  (write-json nil) => "null"
)
(fact "can write boolean to JSON"
  (write-json true)=>"true"
  (write-json false)=>"false")

(fact "can write string to JSON"
  (write-json "teststring")=>"\"teststring\"")

(fact "can write number to JSON"
  (write-json 8) => "8")

(fact "can write keywords to JSON"
  (write-json :id) => "\"id\"")

(fact "can write vectors to JSON"
  (write-json [5 5]) => "[5,5]"
  (write-json ["iamastring" 6 nil :woohoo false]) => "[\"iamastring\",6,null,\"woohoo\",false]"
  )

(fact "can write maps to JSON"
  (write-json {:id 1})=> "{\"id\":1}")
