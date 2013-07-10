import AssemblyKeys._

assemblySettings

normalizedName := "plugin-java"

compileOrder := CompileOrder.JavaThenScala

assembleArtifact in packageScala := false

excludedJars in assembly <<= (fullClasspath in assembly) map { cp => cp }

libraryDependencies ++= Seq(
     "play" %% "play-java" % "2.1.1"
)