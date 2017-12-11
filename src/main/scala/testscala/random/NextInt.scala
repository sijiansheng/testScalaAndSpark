package testscala.random

import scala.util.Random

/**
  * Created by sijiansheng on 2016/11/16.
  */
object NextInt {

  def main(args: Array[String]) {
    val random = new Random()
    println(random.nextInt(1))
    println(random.nextInt(2))
    println(random.nextInt(Int.MaxValue))
  }
}
