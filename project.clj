(defproject ardupilot/clj-ardupilot-utils "0.1.1-SNAPSHOT"
  :description "A collection of utilities for use with ArduPilot or similair autopilots"
  :url "https://github.com/wickedshell/clj-ardupilot-utils"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [commons-io/commons-io "2.5"]]
  :plugins [[perforate "0.3.4"]]
  :profiles {:dev {:resource-paths ["test/resources"]}}
  :global-vars {*warn-on-reflection* true})
