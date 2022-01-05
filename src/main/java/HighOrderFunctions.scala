object HighOrderFunctions {

 def main(args:Array[String]): Unit ={
   println(func(2,add))
   println(multiply(add(6)))

   var lambdaFunc1 = (a:Int,b:Int) => a+b
   println(lambdaFunc1(2,3))

   var lambdaFunc2 = (_:Int)+(_:Int)
   println(lambdaFunc2(4,5))
 }

  def func(x:Int,a:Int=>AnyVal): AnyVal ={
    a(x)
  }

  def add(a:Int):Int = {
   a+2
  }

  def multiply(a:Int):Int = {
    a*2
  }

}
