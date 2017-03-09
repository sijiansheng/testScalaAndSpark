package testscala.collections.seq.listbuffer

import scala.collection.mutable.ListBuffer

/**
  * Created by sijiansheng on 2016/9/5.
  */
object TestListBuffer extends App {

  val platforms = new ListBuffer[String]()

  for (i <- 1 to 32) {
    platforms += i.toString
  }

  platforms.appendAll(List("10001", "40001", "40002", "40003", "40004", "40005", "50001", "50002", "50003", "60001"))
  platforms.remove(1)
  platforms.remove(2)

  platforms.foreach(println)
}
