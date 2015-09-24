# hedgehog

A Clojure project to test overtone and quill.

# Run

* install jack
  * TODO: (linux command)
* start jack
  * sudo jack -r -d alsa -r 44100 -P
  (for non-sudo rights have to check http://ubuntuforums.org/showthread.php?t=1637399&p=10199399#post10199399)
* start soundcollider server
* start overtone in lein repl with the scsynth server port

* for qtjackctl
  * install qt5
  * download qtjackctl and unzip it, cd into folder
  * TODO: sudo ./configure --with-qt5=/opt/qt/5.5
