package testspark.core.action

import scala.util.Random

/**
  * Created by sijiansheng on 2017/3/9.
  */
object GroupByKey {

  def main(args: Array[String]) {

    val sc = testspark.sparkContext
    var numMappers = 100
    var numKVPairs = 10000
    var valSize = 1000
    var numReducers = 36
    val pairs1 = sc.parallelize(0 until numMappers, numMappers).flatMap { p =>
      val ranGen = new Random
      var arr1 = new Array[(Int, Array[Byte])](numKVPairs)
      for (i <- 0 until numKVPairs) {
        val byteArr = new Array[Byte](valSize)
        ranGen.nextBytes(byteArr)
        arr1(i) = (ranGen.nextInt(Int.MaxValue), byteArr)
      }
      arr1
    }.cache
    // Enforce that everything has been calculated and in cache
    pairs1.count
    println(pairs1.groupByKey(numReducers).count)
    sc.stop()
  }
}
