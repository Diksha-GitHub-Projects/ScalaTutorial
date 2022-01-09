package org.scala.tutorial.examples

object StringExamples {
  def main(args:Array[String]): Unit ={
    val s1 = "hello"
    // hello tutorial exist in memory with no ref
    // strings are immutable, each time we are creating new one
    s1+"tutorial"
    val s2 ="hello"
    val s3 ="hello3"
    println(s1 == s2)
    println(s1==s3)
    //content based
    println(s1.equals(s2))
    println(s1.equals(s3))

    // 0 if equal and negative if s1 < s2 and positive if s1 > s2
    println(s1.compareTo(s2))
    println(s1.compareTo(s3))

    println(s1.concat(s2))
    println(s1.substring(0,1))

    // String interpolation
    // passing variables to string or creating strings from data
    // s f raw
    println(s"this is an example $s1")
    val s4 = raw"hello raw ##/t/n"
    println(s4)
  }

}
