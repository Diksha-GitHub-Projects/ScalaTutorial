package org.scala.tutorial.examples
import org.scala.tutorial.examples.Employee

object ExecuteProgram {
   def main(args:Array[String]): Unit ={
     var emp = new Employee(2,"sasha","EC")
     emp.printHello();
   }

  def printFrom(): Unit ={
    println("Hello")
  }
}
