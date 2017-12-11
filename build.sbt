import sbt.ExclusionRule

name := "testScalaAndSpark"

version := "1.0"

scalaVersion := "2.10.5"

resolvers += "kunyanData" at "http://122.225.110.113:9023/nexus/content/groups/kunyanData/"

//scalacOptions += "-Ylog-classpath"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.1.4"

libraryDependencies += "com.typesafe.akka" % "akka-remote_2.10" % "2.1.4"

libraryDependencies += "net.minidev" % "json-smart" % "1.0.9"

libraryDependencies += "edu" % "stdlib" % "1.0"

libraryDependencies += "edu" % "algs4" % "1.0"

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.15"

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.15"

libraryDependencies += "com.codahale.metrics" % "metrics-core" % "3.0.1" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "1.5.2" excludeAll(ExclusionRule("org.scala-lang", "scala-compiler"), ExclusionRule("commons-net", "commons-net"))

libraryDependencies += "com.typesafe.play" % "play-json_2.10" % "2.4.6" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.5.2" excludeAll ExclusionRule("com.fasterxml.jackson.core")

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.4.4"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.4.4"

//storm项目引用 不在这个项目中测试了
//libraryDependencies += "org.apache.storm" % "storm-core" % "0.9.1-incubating"
//
//libraryDependencies += "com.google.guava" % "guava" % "15.0"

//libraryDependencies += "org.jmock" % "jmock" % "2.6.0" % "test"
