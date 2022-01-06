package org.scala.tutorial.examples

// primary constructor
class Employee(id:Int,name:String) {
   var department:String = "CS" // must initialize variables as scala doesnt have default values

   def this(id:Int,name:String,department:String){
       this(id,name)
       this.department = department;
   }

   def printHello():AnyVal={
     println("id:"+id," name: "+name+" department:"+department)
   }
}
