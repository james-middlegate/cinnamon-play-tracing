addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")

addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.7.3")

credentials += Credentials(Path.userHome / ".lightbend" / "commercial.credentials")

resolvers += Resolver.url("lightbend-commercial",
  url("https://repo.lightbend.com/commercial-releases"))(Resolver.ivyStylePatterns)
