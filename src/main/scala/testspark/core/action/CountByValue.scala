package testspark.core.action

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by sijiansheng on 2016/11/2.
  * getClass.getResource("""/wordCount.txt""") 可以得到resource根目录下的wordCount.txt文件
  * 直接用来单词计数
  */
object CountByValue {

  def main(args: Array[String]) {

    val documentPath = getClass.getResource("""/wordCount.txt""").getPath
    val sc = new SparkContext(new SparkConf().setMaster("local").setAppName("TEST_COUNT_BY_VALUE"))
    sc.textFile(documentPath).flatMap(_.split(" ")).countByValue().foreach(println)

  }

}
