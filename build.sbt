
normalizedName := "plugin"

version := "2.1-SNAPSHOT"

scalaVersion := "2.10.2"

javaSource in Compile := new File( "src")

compileOrder := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
    "com.alvazan" % "playorm" % "1.5",
    "play" %% "play" % "2.1.1"
)