package org.scala.tutorial.examples

object TupleExample {
  def main(args: Array[String]): Unit = {
    // you can have multiple values in tuple

    val tuple = (1, 2, "Tuple")
    // tuples are index based
    println(tuple._1)

    tuple.productIterator.foreach(println)
    val returnedTuple = run()
    returnedTuple.productIterator.foreach(println)

  }

  def run():(Int,Int,Int) = {
    (7, 8, 9)
  }

}

