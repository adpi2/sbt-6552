package hello

import scala.io.Source

object Main extends App {
  Source.fromResource("assets/greeting.txt", getClass.getClassLoader)
    .getLines()
    .foreach(println)
}
