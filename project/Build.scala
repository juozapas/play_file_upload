import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "file-upload"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "commons-io" % "commons-io" % "2.0.1",

      "commons-codec" % "commons-codec" % "1.7"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
