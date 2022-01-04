package org.scala.tutorial.examples

import scala.util.control.Breaks._

object BreakExample {
   def main(args:Array[String]): Unit = {
     breakable {
     for (i <- 1 to 10) {
       if (i % 2 == 0)
         break
       println(i)
     }
   }
 }
}
