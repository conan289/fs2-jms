name := "fs2-jms"

scalaVersion := "2.12.7"

val fs2Version = "1.0.0"

libraryDependencies ++= Seq(
  "co.fs2"        %% "fs2-core"          % fs2Version,
  "co.fs2"        %% "fs2-io"            % fs2Version,
  "javax.jms"     % "javax.jms-api"      % "2.0.1",
  "org.scalatest" %% "scalatest"         % "3.0.4" % Test,
  "org.mockito"   % "mockito-scala_2.12" % "1.0.0" % Test
)
