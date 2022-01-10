package org.scala.tutorial.examples
import scala.collection.mutable._

object ListExample {
  def main(args: Array[String]): Unit = {
    // maintains order and can have duplicates
    // list is immutable += will not work , use instead ListBuffer
   val list1:List[Int] = List(1,2,3,1)
    val listBuffer:ListBuffer[Int] = ListBuffer(1,2,3,4,2)
    listBuffer += 5
    listBuffer.foreach(println)
  }
}
