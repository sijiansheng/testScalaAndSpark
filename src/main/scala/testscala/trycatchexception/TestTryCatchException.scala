package testscala.trycatchexception

/**
  * Created by sijiansheng on 2016/9/23.
  */
case class TestObject()
object TestTryCatchException {


  def main(args: Array[String]) {

    val list = List(0, 1, 2, 3)

    println(list(0))
//    println(list(5))

    try {
      println(list(5))
    } catch {
      case e: IndexOutOfBoundsException =>
        println("数组超界异常")
      case e: Exception =>
        println("其他异常")
    }


  }

}
