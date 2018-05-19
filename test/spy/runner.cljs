(ns spy.runner
  (:require  [doo.runner :refer-macros [doo-tests]]
             [spy.core-test]
             [spy.core-test-cljs]
             [spy.assert-test]))

(doo-tests 'spy.core-test
           'spy.core-test-cljs
           'spy.assert-test)
