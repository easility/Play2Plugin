
normalizedName := "plugin"

version := "2.1-SNAPSHOT"

scalaVersion := "2.10.2"

javaSource in Compile := new File( "src")

compileOrder := CompileOrder.JavaThenScala

crossPaths := false

libraryDependencies ++= Seq(
    "com.alvazan" % "playorm" % "1.5",
    "play" %% "play" % "2.1.1"
)
