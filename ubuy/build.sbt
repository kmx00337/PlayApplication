name := "ubuy"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.avaje.ebeanorm" % "avaje-ebeanorm-api" % "3.1.1",
  "mysql" % "mysql-connector-java" % "5.1.21"
)    
 
javacOptions += "-Xlint:-options"

play.Project.playJavaSettings
