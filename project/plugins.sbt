resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  Opts.resolver.sonatypeReleases
)

resolvers += Resolver.bintrayRepo("choffmeister", "maven")
resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Classpaths.typesafeResolver

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.10")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")

