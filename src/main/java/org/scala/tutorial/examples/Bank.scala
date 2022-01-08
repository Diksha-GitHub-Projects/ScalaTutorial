package org.scala.tutorial.examples

class Bank {

  var roi:Int = 0;
  val mainBank = "Central";

  def rateOfInterest(){
    println(roi)
  }

}

class SBI extends Bank{
  override val mainBank:String = "Chatered"
  override def rateOfInterest(){
  println(roi)
}
}

object Print{
  def main(args:Array[String]){
   val sbi = new SBI();
   sbi.rateOfInterest()
}
}
