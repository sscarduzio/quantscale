organization := "org.qslib"

name := "quantscale"

version := "0.1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scala-saddle" %% "saddle-core" % "1.3.+",
  "org.scalanlp" %% "breeze" % "0.12",
  "com.github.nscala-time" %% "nscala-time" % "2.14.0",
  "org.scala-stm" % "scala-stm_2.11" % "0.7",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.1" % "test",
  "junit" % "junit" % "4.12" % "test"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)
