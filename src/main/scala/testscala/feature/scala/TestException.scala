package testscala.feature.scala

import scala.collection.mutable.ListBuffer

/**
  * Created by sijiansheng on 2016/8/12.
  */
object TestException {

  def main(args: Array[String]) {

    val testData:ListBuffer[String] = null

    try{
      println(testData.length)
    }catch {
      case e:Exception=>
        println(e)
        println(s"e.getLocalizedMessage:${e.getLocalizedMessage}")
        println(s"e.getStackTrace:${e.getStackTrace}")
        println(s"e.getSuppressed:${e.getSuppressed}")
        println(s"e.getCause:${e.getCause}")
        println(s"e.getStackTraceString:${e.getStackTraceString}")
        println(s"e.getMessage:${e.getMessage}")
        e.printStackTrace()

    }
  }
}
