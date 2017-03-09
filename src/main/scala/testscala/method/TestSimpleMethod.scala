package testscala.method

/**
  * Created by sijiansheng on 2016/10/8.
  */
object TestSimpleMethod {

  def main(args: Array[String]) {

    println(sum(2))
    println(sum(2,2))
  }

  def sum(a: Int, b: Int = 1): Int = {
    a + b
  }

}
