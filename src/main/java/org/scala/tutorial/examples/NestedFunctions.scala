package org.scala.tutorial.examples

object NestedFunctions {

  def main(args:Array[String]): Unit = {
    print(function1(2,3,7))
}

  def function1(a: Int, b: Int, c:Int): Int= {
    var d = a * b
    def function2(d: Int, e: Int):Int = {
     d + e
    }
    function2(d, c)
  }
}
