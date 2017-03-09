import sbt.ExclusionRule

name := "testScalaAndSpark"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "Kunyan Repo" at "http://61.147.114.67:8081/nexus/content/groups/public/"

//scalacOptions += "-Ylog-classpath"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.1.4"

libraryDependencies += "com.typesafe.akka" % "akka-remote_2.10" % "2.1.4"

libraryDependencies += "net.minidev" % "json-smart" % "1.0.9"

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.15"

//com.fasterxml.jackson.core:jackson-databind:2.5.4:jar
libraryDependencies += "com.codahale.metrics" % "metrics-core" % "3.0.1" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "1.5.2" excludeAll(ExclusionRule("org.scala-lang", "scala-compiler"), ExclusionRule("commons-net", "commons-net"))

libraryDependencies += "com.typesafe.play" % "play-json_2.10" % "2.4.6" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.5.2" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.4.4"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.4.4"



