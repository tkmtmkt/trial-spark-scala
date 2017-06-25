organization := "com.github.tkmtmkt"

name := "study-spark-scala"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  //コンパイル用（コンパイル、実行、配布）
  "org.slf4j" % "slf4j-api" % "1.7.25" % "compile",

  //コンパイル用（コンパイル）
  "org.apache.spark" %% "spark-core" % "2.1.1" % "provided",

  //コンパイル用（実行、配布）
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",

  //テスト用（コンパイル、実行）
  "junit" % "junit" % "4.12" % "test",
  "org.specs2" %% "specs2-core" % "3.9.1" % "test",
  "org.specs2" %% "specs2-mock" % "3.9.1" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.9.1" % "test"
)
