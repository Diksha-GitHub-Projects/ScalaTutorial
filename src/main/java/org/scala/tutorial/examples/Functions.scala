package org.scala.tutorial.examples

object Functions {

  def main(args:Array[String]) : Unit = {
    println(add(2,3))
    // no arguments
    println(addWithDefault())
    // with one argument
    println(addWithDefault(10))
    // changing order by using parameter names
    println(addWithDefault(b=1,a=0))
  }

  def add(a:Int,b:Int): Int={
    a+b
  }

  // functions with default values

  def addWithDefault(a:Int=3,b:Int=4): Int ={
   a+b
  }

}
