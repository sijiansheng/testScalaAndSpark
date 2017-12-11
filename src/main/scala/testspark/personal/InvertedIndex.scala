package testspark.personal

import org.apache.spark.SparkContext

import scala.collection.mutable

/**
  * Created by sijiansheng on 2017/3/13.
  */
object InvertedIndex {

  def main(args: Array[String]) {

    //    val sc = testspark.sparkContext
    val sc = new SparkContext("local", "testSpark")

    val words = sc.textFile(args(0)).map(file => file.split("\t")).map(item => {
      (item(0), item(1))
    }).flatMap(file => {
      val list = new mutable.LinkedList[(String, String)]()
      val words = file._2.split(" ").iterator
      while (words.hasNext) {
        list + words.next()
      }

      list
    }).distinct()

    //    words.map(word => {
    //      (word._2, word._1)
    //    }).reduce((a1,b1)=>{a1.toString()+"\t"+b1.toString()})
  }
}
