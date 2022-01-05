package org.scala.tutorial.examples

object FunctionCurrying {
/*
 * Function currying is a taking to breakdown method which takes multiple arguments to one argument or two
 * agruments
 * it creates partial function with previous values
 */

  def main(args:Array[String]):Unit={
    var partialFunc1 = add(2)_
    var partialFunc2 = partialFunc1(1)
    println(partialFunc2(2))

  }

  def add(a:Int)(b:Int)(c:Int) ={
    a+b+c
  }

}
