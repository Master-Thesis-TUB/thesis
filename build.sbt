name := "thesis"

version := "0.1"

scalaVersion := "2.12.4"


val akkaVersion = "2.6.3"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % akkaVersion
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.3"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.10.3"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.3"
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.3"
