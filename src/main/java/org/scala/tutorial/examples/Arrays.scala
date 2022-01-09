package org.scala.tutorial.examples

object Arrays {

  def main(args:Array[String]): Unit ={
    val array1 = Array(1,2,3)
    for(a <- array1){
      println(a)
    }

      // by default initialized with zero
    val array2 = new Array[Int](3)
    array2.foreach((a:Int) => println(a))

    array2(2) = 1

    println(array2(2))

    val array3 = Array.ofDim[Int](2,3)
    val array4 = Array(Array(1,2,3),Array(3,4,5))
    for(i <- 0 to 1){
      for(j <- 0 to 2){
        println(array4(i)(j))
      }

    }

  }

}
