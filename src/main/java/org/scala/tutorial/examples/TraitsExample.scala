package org.scala.tutorial.examples

trait TraitsExample {
  var a:Int
  var c:Int = 1
  def run()
}

class A(b:Int) extends TraitsExample{
  var a:Int = b;
  def run(): Unit ={
    println(a)
    println(c)
  }

}

object Run1{
  def main(args:Array[String]) {
    var obj = new A(20);
    obj.run()
  }
}
