addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)

version in ThisBuild := "0.1.2-SNAPSHOT"

scalacOptions += "-Ypartial-unification" // 2.11.9+

//DOOBIE

libraryDependencies ++= Seq(

  "org.tpolecat" %% "doobie-core"      % "0.5.3",
  "org.tpolecat" %% "doobie-h2"        % "0.5.3", // H2 driver 1.4.197 + type mappings.
  "org.tpolecat" %% "doobie-hikari"    % "0.5.3", // HikariCP transactor.
  "org.tpolecat" %% "doobie-postgres"  % "0.5.3", // Postgres driver 42.2.2 + type mappings.
  "org.tpolecat" %% "doobie-specs2"    % "0.5.3", // Specs2 support for typechecking statements.
  "org.tpolecat" %% "doobie-scalatest" % "0.5.3"  // ScalaTest support for typechecking statements.

)


lazy val root = project
  .in(file("."))
  .settings(name := "freestyle-lib")
  .settings(libraryDependencies += "io.frees" %% "frees-core" % "0.8.1")
  .settings(libraryDependencies += "io.frees" %% "frees-logging" % "0.8.1")
  .settings(libraryDependencies += "io.frees" %% "frees-doobie" % "0.8.1")
  .settings(libraryDependencies += "io.frees" %% "frees-effects" % "0.8.1")
