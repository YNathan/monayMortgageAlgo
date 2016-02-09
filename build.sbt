name := "MyServer"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.18"
)     

play.Project.playJavaSettings
