resolvers += Resolver.sonatypeRepo("releases")

addSbtPlugin("io.frees"        % "sbt-freestyle"   % "0.3.21")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0")
