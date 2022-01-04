package org.scala.tutorial.examples

object VariablesInScala {
  def main(args:Array[String]): Unit ={
    // creating mutable variable in scala with keyword var
    var mutableVar:Int = 100
    println(mutableVar)
    mutableVar = 200
    println(mutableVar)

    // creating immutable variable in scala with keyword val
    val immutableVar:Int = 300
    println(mutableVar)
    // Exception reassignment to val is not allowed
    //immutableVar = 400
    println(mutableVar)
  }

}
