import AssemblyKeys._

assemblySettings

name := "hoge"

version := "1.0"
     
scalaVersion := "2.11.6"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"   % "2.3-SNAPSHOT",
  "com.typesafe.akka" %% "akka-remote" % "2.3-SNAPSHOT"
)
