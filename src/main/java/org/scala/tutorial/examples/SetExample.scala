package org.scala.tutorial.examples
import scala.collection.mutable._

object SetExample {
  def main(args: Array[String]): Unit = {

    val set1:Set[Int] = HashSet(1,2,3)
    val set2 = Set.empty
    val set3 = Set(6,7,8)
    //Sequence when working with small data
    val seq = Seq("a","b","c")
    seq.foreach(println)

    //index based
    val vector = Vector(10,19,20)
    println(vector(2))

     set1.foreach(println)
     println(set1.isEmpty)
     println(set1.contains(3))
     set1+=4
     for(i<- set1) {
       println(i)
     }

    val set4 = set1 ++ set3
    val set5 = set1 & set3
    println(set4)
    println(set5)

    println(set5.size)

  }
}
