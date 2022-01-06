package org.scala.tutorial.examples

//Companion Object and class
class AnotherObject(id:Int){
  def printMethod(): Unit ={
    println(id)
  }
}
object AnotherObject {
  def main(args:Array[String]): Unit ={
    // no new to create instance for Object, just call the method directly
    ExecuteProgram.printFrom()
    new AnotherObject(3).printMethod()
    var caseClassExample = CaseClasses(10,"Java")
    println(caseClassExample.id)
    println(caseClassExample.name)
  }
}
