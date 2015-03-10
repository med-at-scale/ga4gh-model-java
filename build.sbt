organization := "med-at-scale"

name := "ga4gh-model-java"

crossPaths := false

version := "0.1.1-SNAPSHOT" // current version of the schemas is 0.6.0-SNAPSHOT

publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

seq( sbtavro.SbtAvro.avroSettings : _*)

(stringType in avroConfig) := "String"

sourceDirectory in avroConfig := file("schemas/src/main/resources/avro/")

libraryDependencies ++= Seq(
  "org.apache.avro" % "avro"          % "1.7.6",
  "org.apache.avro" % "avro-ipc"      % "1.7.6",
  "org.apache.avro" % "avro-compiler" % "1.7.6"
)
