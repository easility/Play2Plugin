import sbt._
import Keys._

object Play2PluginBuild extends Build {
  lazy val root = Project(id = "plugin-root",
    base = file(".")) aggregate(scalaplugin, javaplugin)

  lazy val scalaplugin = Project(id = "plugin-scala",
    base = file("core"))

  lazy val javaplugin = Project(id = "plugin-java",
    base = file("javaplugin")) dependsOn (scalaplugin)
}