(defproject cmdb "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [postgresql/postgresql "9.0-801.jdbc4"]
                 [org.clojure/java.jdbc "0.0.5"]
                 [clj-json "0.3.2"]
                 [digest "1.2.1"]
                 [log4j "1.2.16" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]
  :aot [com.puppetlabs.cmdb.core]
  :main com.puppetlabs.cmdb.core
)