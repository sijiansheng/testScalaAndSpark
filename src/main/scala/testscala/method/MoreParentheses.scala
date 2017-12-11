package testscala.method

/**
  * Created by sijiansheng on 2016/10/8.
  */
object MoreParentheses {

  def main(args: Array[String]) {

//    println(sum(1))
    println(sum(1)(2))
  }

  def sum(a:Int)(b:Int):Int={
    a + b
  }
}
