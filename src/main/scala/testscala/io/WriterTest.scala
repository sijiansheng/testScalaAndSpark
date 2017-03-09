package testscala.io

import java.io.{FileWriter, File}
import java.text.SimpleDateFormat

import scala.collection.mutable.ListBuffer

/**
  * Created by sijiansheng on 2016/12/15.
  */
object WriterTest {

  val dateFormat = "yyyy-MM-dd"
  val timeInterval = 24 * 60 * 60 * 1000L
  val path = "e://heat/test.txt"

  def main(args: Array[String]) {

    val startTime = "2016-09-01"
    val endTime = "2016-11-30"
    val timeIntervals = getTimeInterval(getTimeTamp(startTime), getTimeTamp(endTime))

    val file = new File(path)
    val writer = new FileWriter(path, false)

    timeIntervals.foreach { timeInterval =>
      writer.write(timeInterval + "\n")
    }

    writer.close()
  }

  def getTimeTamp(timeString: String): Long = {
    new SimpleDateFormat(dateFormat).parse(timeString).getTime
  }

  def getTimeInterval(startTime: Long, endTime: Long): List[String] = {

    val result = ListBuffer[String]()
    val timeInter = ((endTime - startTime) / timeInterval).toInt

    for (i <- 0 to timeInter) {
      val needAdd = timeInterval * i
      val needParserTimeStamp = startTime + needAdd
      val date = new SimpleDateFormat(dateFormat).format(needParserTimeStamp)
      result += date
    }

    result.toList
  }
}
