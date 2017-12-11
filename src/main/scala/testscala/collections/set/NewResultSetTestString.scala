package testscala.collections.set

import scala.collection.mutable

/**
  * Created by sijiansheng on 2017/5/11.
  */
//todo 这个问题实在是不明白
object NewResultSetTestString {

  def main(args: Array[String]) {

    val resultSet = mutable.Set[String]("600874", "300648", "300075", "600408", "300117", "603081", "603616", "603139", "600354", "002307", "300419", "600291", "002282", "603232", "002866", "002494", "300107", "603787", "603920", "002552", "002867", "600133", "603797", "600908", "000856", "002755", "300263", "603096", "002158", "603050", "300554", "002542", "300137", "000791")
    val comparedSet = mutable.Set[String]("002745", "002800", "002836", "300383", "300645", "603050", "603320", "300642", "300604", "300648", "603663", "002866", "603628", "603232", "300334", "002858", "603803", "603139", "601228", "600242", "603778", "300344", "300554", "002819", "002865", "603826", "600581")

    println(s"resultSet.size:${resultSet.size}")

    val iterator = resultSet.iterator

    var iteratorFlag = 0

//    println(s"iterator.size:${iterator.size}")

    while (iterator.hasNext) {

      val flag = iterator.next()

      if (!comparedSet.contains(flag)) {
        resultSet.remove(flag)
        println(s"需要移除的字符串是$flag")
      } else {
        println(s"不需要移除的字符串是$flag")
      }

      iteratorFlag += 1
      println(s"result.size:${resultSet.size}")
    }

    println(s"iteratorFlag:$iteratorFlag")
    println(s"newResult${resultSet.toList.mkString(",")}")
    //todo 使用remove方法后遍历的数量和实际的数量不符合，如果不使用remove方法，遍历的数量和实际的数量是相符的
  }

}
