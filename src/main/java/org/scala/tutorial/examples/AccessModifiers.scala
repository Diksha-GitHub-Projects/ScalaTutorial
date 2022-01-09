package org.scala.tutorial.examples

class PrivateAccess{
  private val a:Int =10;
  protected val b:Int = 20;

  def printMethod(): Unit ={
    println(a);
  }
}

class ProtectedAccess extends PrivateAccess{
  def runMethod(){
   println(b)
}
}
object AccessModifiers {


  // by default no modifier
  // protected only subclasses
  // private only class
  def main(args:Array[String]) {
    val privateAccess = new PrivateAccess();
    //println(privateAccess.a)
    val protectedAccess = new ProtectedAccess()
    protectedAccess.runMethod();
  }
}
