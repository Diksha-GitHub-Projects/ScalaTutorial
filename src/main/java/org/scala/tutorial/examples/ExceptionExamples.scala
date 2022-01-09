package org.scala.tutorial.examples

object ExceptionExamples {

  // your program wont terminate abruptily
  def main(args:Array[String]): Unit ={
    try{
      //run(10,0)
      //run1(20,0)
      run2(40,0)
    }catch{
      case e:ArithmeticException => println("airthmetic")
      case e:Exception => println("inside catch block : Exception")
    }finally{
      println("finally always executes")
    }

    println("rest of the program")
  }

  def run(a:Int,b:Int): Unit ={
    if(b == 0) throw new ArithmeticException("should not be zero")
    val c:Int = a/b;
  }

  @throws(classOf[ArithmeticException])
  def run1(a:Int,b:Int): Unit ={
    if(b == 0) throw new ArithmeticException("should not be zero")
    val c:Int = a/b;
  }

  //custom exception
  class InvalidArgument(a:String) extends Exception(a)

  // throws with method definition
  // throw inside method
  @throws(classOf[InvalidArgument])
  def run2(a:Int,b:Int): Unit ={
    if(b == 0) throw new InvalidArgument("should not be zero")
    val c:Int = a/b;
  }
}
