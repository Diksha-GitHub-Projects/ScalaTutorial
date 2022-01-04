package org.scala.tutorial.examples

object LoopExamples {
  def main(args:Array[String]): Unit ={
    var i:Int = 0
    //while loop execution
    while(i < 10){
      println("while : "+i)
      i = i + 1
    }

    // do while loop execution
    i = 0
    do{
      println("do while: "+ i)
      i = i +1
    }while(i < 10)
  }

  // for with range

  for( i <- 1 to 10) {
    println("for range to : "+ i)
  }

  for(i <- 1 until 10){
    println("for range until (n-1):" + i)
  }

  // for with if condition
  for(i <- 1 to 10 if i%2 ==0){
    println("prime number: "+ i)
  }

  // foreach with collection
  var list = List(1,2,3,4)
  for(value <- list){
   println("List value: " + value)
  }

  list.foreach(println)
  list.foreach((x:Int) => println(x+1))
}
