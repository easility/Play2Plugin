organization in ThisBuild := "com.alvazan.play2"

version in ThisBuild := "2.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.2"

publish := ()

publishLocal := ()

normalizedName := "root"

libraryDependencies in ThisBuild ++= Seq(
    "com.alvazan" % "playorm" % "1.6",
    "play" %% "play" % "2.1.2"
)

resolvers in ThisBuild += Resolver.typesafeRepo("releases")