package org.scala.tutorial.examples

object PatternMatching {

  def main(args:Array[String]): Unit= {
    matchNum("Hello")
  }

  //Any is superclass of all data types
  def matchNum(search:Any) : Any={
    search match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => print("search: " + search)
    }
  }

}
