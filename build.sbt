xname := """scalauthx"""

organization := "com.ejisan"

version := "1.1-SNAPSHOT"

scalaVersion := "3.3.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies += "org.specs2" %% "specs2-core" % "5.3.2" % Test

resolvers += "luckyslevin Github" at "https://luckyslevin.github.io/repo/"

publishTo := Some(Resolver.file("ejisan", file(Path.userHome.absolutePath + "/Development/repo.ejisan"))(Patterns(true, Resolver.mavenStyleBasePattern)))
