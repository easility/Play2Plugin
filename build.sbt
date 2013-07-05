organization := "com.alvazan.play2"

normalizedName := "plugin"

version := "2.1-SNAPSHOT"

scalaVersion := "2.10.2"

compileOrder := CompileOrder.JavaThenScala

crossPaths := false

libraryDependencies ++= Seq(
    "com.alvazan" % "playorm" % "1.5",
    "play" %% "play" % "2.1.1"
)
