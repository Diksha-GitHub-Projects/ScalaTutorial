package org.scala.tutorial.examples

import scala.collection.mutable._

object MapExample {
  def main(args: Array[String]): Unit = {
    val map: Map[String, String] = HashMap("C" -> "D", "E" -> "F")
    val newmap = map + ("V" -> "L")
    println(newmap.size)

    //Some and None are related to Option[T] , if value is present then instance of Some else None
    println(newmap.get("C").get.equals("C"))
    println(newmap.get("A").equals(None))
    newmap.foreach { case (k, v) => println(k + v) }
  }
}
