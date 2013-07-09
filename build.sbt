organization in ThisBuild := "com.alvazan.play2"

version in ThisBuild := "2.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.2"

publishArtifact := false

normalizedName := "root"

libraryDependencies in ThisBuild ++= Seq(
    "com.alvazan" % "playorm" % "1.5",
    "play" %% "play" % "2.1.1"
)