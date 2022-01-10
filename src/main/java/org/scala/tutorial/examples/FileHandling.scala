package org.scala.tutorial.examples

import scala.io._

object FileHandling {
  def main(args: Array[String]) {
  val readFile = Source.fromFile("C:\\Users\\R D\\OneDrive\\Desktop\\house_post.txt")
  for (i <- readFile.getLines()) {
    println(i)
  }

    // For Write we have to use Java class FileWriter or PrintWriter
}
}
