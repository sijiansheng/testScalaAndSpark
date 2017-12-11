package testscala.collections.set

import scala.collection.mutable

/**
  * Created by sijiansheng on 2017/5/11.
  */
object ResultSetTestInt {

  def main(args: Array[String]) {

    val resultSet = mutable.Set[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
    val comparedSet = mutable.Set[Int](3, 4, 5, 7, 8, 9, 11, 26, 30, 48, 49, 50)
    val iterator = resultSet.iterator

    var iteratorFlag = 0

    while (iterator.hasNext) {

      val number = iterator.next()

      if (!comparedSet.contains(number)) {
        resultSet.remove(number)
        println(s"需要移除的数字是$number")
      } else {
        println(s"不需要移除的数字是$number")
      }

      iteratorFlag += 1
      println(s"result.size:${resultSet.size}")
    }

    println(s"iteratorFlag:$iteratorFlag")
    println(s"newResult${resultSet.toList.mkString(",")}")
  }

}
