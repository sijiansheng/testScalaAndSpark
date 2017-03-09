package testspark.core.action

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sijiansheng on 2016/11/1.
  */
object Aggregate {

  def main(args: Array[String]) {

    val sc = new SparkContext(new SparkConf().setMaster("local").setAppName("TEST_AGGREGATE"))

//        val list = sc.makeRDD(List(1, 2, 3, 3))
//        println(list.aggregate((0, 0))((x, y) => (x._1 + y, x._2 + 1), (x, y) => (x._1 + y._1, x._2 + y._2)))
//        结果：（9,4）
//        0+1=1,+1=1    1+2=3，1+1=2   3+3=6，2+1=3  6+3=9，2+1=4
//        0+9=9，0+4=4

    //    val list = sc.makeRDD(List(1, 2, 3, 3), 2)
    //    println(list.aggregate((0, 0))((x, y) => (x._1 + y, x._2 + 1), (x, y) => (x._1 + y._1, x._2 + y._2)))
    //    结果（9,4）

    //    val list = sc.makeRDD(List(1, 2, 3, 3))
    //    println(list.aggregate(2)((x: Int, y: Int) => x + y, (a: Int, b: Int) => a * b))
    //    结果：22
    //    计算步骤： 2+1+2+3+3 = 22
    //    2*11 = 22

    //    val list = sc.makeRDD(List(1, 2, 3, 3),2)
    //    println(list.aggregate(2)((x: Int, y: Int) => x + y, (a: Int, b: Int) => a * b))
    //    结果：80
    //    计算步骤： 2+1+2 = 5  2+3+3 = 8
    //    2*5*8 = 80
  }

}
