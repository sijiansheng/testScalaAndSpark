package testscala.syntacticsugar

import scala.io.Source

/**
  * Created by sijiansheng on 2016/12/12.
  */
object STest {

  def main(args: Array[String]) {

    val array = Array(1,2)
//    println(s"array:${array.slice(0,21)}")

    println("日均查看热度离均差大于5倍前10天日均热度标准差的行业".replaceAll("[^\\-\\.0-9万亿\\:\\%]"," "))
    println("    ".split(" ").length)

//    println(Source.fromFile("file:///e://data.txt").mkString)
    println(7/4)
  }

}
