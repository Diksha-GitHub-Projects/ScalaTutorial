package org.scala.tutorial.examples

object ConditionalExpression {
  def main(args: Array[String]): Unit = {
    var num: Int = 20
    if (num < 20) {
      println("Age is less than 20")
    }else{
      println("Age is greater or equal to "+ num)
    }

    val newNum = checkIf(num)
    println(newNum)
  }

  // scala has no ternary operator, passing if expression to function and returning value
  def checkIf(num: Int) : Int = if(num%2 ==0) 1 else 0
}
