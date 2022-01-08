package org.scala.tutorial.examples

abstract class AbstractClassExample(a:Int){
  def print(): Unit ={
    println(a)
  }
  def run()
}

class SubClass(a:Int) extends AbstractClassExample(a){
   def run(){
     println(a)
   }
}

object Run{
  def main(args:Array[String]): Unit ={
    val subClass = new SubClass(10)
    subClass.run()
  }
}