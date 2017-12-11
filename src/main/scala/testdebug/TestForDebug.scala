package testdebug

/**
  * Created by sijiansheng on 2016/8/25.
  */
object TestForDebug {

  def main(args: Array[String]) {

    val a = 1
    val b = 5
    var c = 0
    for (i <- 0 to b)
      c = a + i
    println(c)
  }
}
