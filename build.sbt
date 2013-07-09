organization in ThisBuild := "com.alvazan.play2"

normalizedName := "plugin"

version in ThisBuild := "2.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.2"

libraryDependencies in ThisBuild ++= Seq(
    "com.alvazan" % "playorm" % "1.5",
    "play" %% "play" % "2.1.1"
)