name := "littlemail"

version := "0.5"

scalaVersion := "2.10.4"

libraryDependencies <+= scalaVersion ("org.scala-lang" % "scala-swing" % _ )

libraryDependencies += "javax.mail" % "mail" % "1.4.7"

