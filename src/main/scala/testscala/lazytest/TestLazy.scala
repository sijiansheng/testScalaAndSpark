package testscala.lazytest

/**
  * Created by sijiansheng on 2017/1/22.
  */
object TestLazy {

  def main(args: Array[String]) {

    //    println({
    //      val a = 10
    //      val b = 15
    //      println("打印输出")
    //      a + b
    //    })

    //    val x = maybeTwice(true, {
    //      println("hi");
    //      1 + 14
    //    })

    val x = maybeTwice2(true, {
      println("hi");
      1 + 14
    })
  }

  //twice
  def maybeTwice(b: Boolean, i: => Int) = if (b) i + i else 0

  def maybeTwice2(b: Boolean, i: => Int) = {
    lazy val j = i
    if (b) j + j else 0
  }

}
