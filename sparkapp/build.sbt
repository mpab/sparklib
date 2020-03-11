import Dependencies._

ThisBuild / scalaVersion     := "2.11.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.asrai"
ThisBuild / organizationName := "asrai"

lazy val root = (project in file("."))
  .settings(
    name := "sparkapp",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0",
    resolvers += "Akka Repository" at "https://repo.akka.io/releases/"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
