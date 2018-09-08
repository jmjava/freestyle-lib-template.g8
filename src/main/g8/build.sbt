pgpPassphrase := Some(getEnvVar("PGP_PASSPHRASE").getOrElse("").toCharArray)
pgpPublicRing := file(s"\$gpgFolder/pubring.gpg")
pgpSecretRing := file(s"\$gpgFolder/secring.gpg")

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full)

lazy val root = project
  .in(file("."))
  .settings(name := "$project$")
  .settings(moduleName := "root")
  .settings(noPublishSettings: _*)
  .settings(scalaMetaSettings: _*)
  .settings(libraryDependencies ++= commonDeps ++ freestyleCoreDeps())
  .settings(libraryDependencies += "io.frees" %% "frees-core" % "0.8.2")
  .dependsOn(coreJVM)
  .aggregate(coreJS, coreJVM)

lazy val core = crossProject
  .in(file("core"))
  .settings(moduleName := "$project$")
  .settings(scalaMetaSettings: _*)
  .crossDepSettings(commonDeps ++ freestyleCoreDeps(): _*)
  .jsSettings(sharedJsSettings: _*)


lazy val coreJVM = core.jvm
lazy val coreJS = core.js
