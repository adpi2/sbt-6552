val hello = project.in(file("."))
  .settings(
    scalaVersion := "2.13.6",
    Compile / resourceGenerators += Def.task {
      val greeting = (Compile / resourceManaged).value / "assets" / "greeting.txt"
      IO.write(greeting, "Hello, World!")
      Seq(greeting)
    }
  )
