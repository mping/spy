(ns spy.assert
  (:require [clojure.test :refer [is]]
            [spy.core :as spy]))

(defn- calls [n]
  (if (= 1 n)
    "call"
    "calls"))

(defn calls-message [f expected-count]
  (str "Expected " expected-count " " (calls expected-count) ", "
       "received " (spy/call-count f) " " (calls (spy/call-count f)) "."))

(defn called-n-times?
  [f n]
  (is (spy/called-once? f)
      (calls-message f 1)))

(defn not-called?
  [f]
  (is (spy/not-called? f)
      (calls-message f 0)))

(defn called-once?
  [f]
  (is (spy/called-once? f)
      (calls-message f 1)))

(defn called-with?
  [f & args])

(defn not-called-with?
  [f & args])

(defn called-once-with?
  [f & args])

(defn called-at-least-n-times?
  [f n])

(defn called?
  [f])

(defn called-at-least-once?
  [f])

(defn called-no-more-than-n-times?
  [f n])

(defn called-no-more-than-once?
  [f])