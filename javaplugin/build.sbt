normalizedName := "plugin-java"

compileOrder := CompileOrder.JavaThenScala

libraryDependencies in ThisBuild ++= Seq(
     "play" %% "play-java" % "2.1.1"
)