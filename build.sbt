name := "ChatApp"

version := "0.1"

scalaVersion := "2.12.8"

lazy val akkaVersion = "2.5.21"
lazy val protobufVersion = "3.6.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % "3.0.0"


)