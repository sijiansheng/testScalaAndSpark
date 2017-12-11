import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sijiansheng on 2016/11/2.
  */
package object testspark {

  val sparkContext = new SparkContext(new SparkConf().setMaster("local").setAppName("TEST_SPARK"))
}
