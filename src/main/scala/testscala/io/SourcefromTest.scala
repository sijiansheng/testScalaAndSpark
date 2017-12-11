package testscala.io
import scala.io.Source
/**
  * Created by sijiansheng on 2017/2/9.
  */
object SourcefromTest {

  def main(args: Array[String]) {

    println(Source.fromFile("file:/home/newsparser/conf/classification/classify_dict/industry_words.words").getLines().mkString(","))
  }
}
