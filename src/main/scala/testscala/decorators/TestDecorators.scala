package testscala.decorators

import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer

/**
  * Created by sijiansheng on 2016/9/7.
  */
object TestDecorators {

  def main(args: Array[String]) {

    //    val tempSeq = Seq[String]("1","2")
    var a = new java.util.ArrayList[String]()
    println(a.getClass)
    val b = a.asScala
    println(b.getClass)

    val sl = new ListBuffer[Int]
    println(sl.getClass)
    val jl = sl.asJava
    println(jl.getClass)
  }
}
