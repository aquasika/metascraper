name := "metascraper"

version := "0.3.6-SNAPSHOT"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

crossVersion := CrossVersion.binary

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.16" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.3.16",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.3",
  "com.ning" % "async-http-client" % "1.9.40",
  "commons-validator" % "commons-validator" % "1.5.1",
  "org.jsoup" % "jsoup" % "1.10.2"
)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

organization := "com.beachape.metascraper"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint", "-Xlog-free-terms")

pomExtra := (
  <url>https://github.com/lloydmeta/metascraper</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:lloydmeta/metascraper.git</url>
    <connection>scm:git:git@github.com:lloydmeta/metascraper.git</connection>
  </scm>
  <developers>
    <developer>
      <id>lloydmeta</id>
      <name>Lloyd Chan</name>
      <url>https://beachape.com</url>
    </developer>
  </developers>
)

scalariformSettings