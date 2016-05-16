This is an sample integration project with AppDirect API

Prerequisites to build and run this project: gradle & java8

There are 2 ways to run this project

1. "gradle build" to build a jar from the source code. Then run "java -jar /build/lib/appdirect-<version>.jar" 

2. "gradle bootRun"

Features present:

* Oauth verification for incoming requests.

* Oauth signature for outgoing reuqests.

* A working API skeleton for subscription events & user assginment events


Missing things:

* Unit tests.

* Internal implementation(internal logic per vendor) for processing subscriptions & user events

