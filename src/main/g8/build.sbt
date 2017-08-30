name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "utest" % "0.4.8" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

shellPrompt := { state => "$name$> " }

initialCommands := "import $organization$.$name;format="lower,word"$._"

