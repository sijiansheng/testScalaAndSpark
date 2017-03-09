package testscala.io

import java.io._

import scala.io.Source

/**
  * Created by sijiansheng on 2016/8/26.
  */
object IOTest {

  def main(args: Array[String]) {

    var line: String = null

    while ( {
      line = getLine("e://data.txt")
      line
    } != null) {
      println(line)
    }

  }

  def getLine(path: String): String = {

    val file = new File(path)

    val reader = new BufferedReader(new FileReader(file))
    var (line, secondLine, needWriter) = (reader.readLine(), reader.readLine(), "")

    while (secondLine != null) {
      needWriter = needWriter + secondLine + "\n"
      secondLine = reader.readLine()
    }
    reader.close()

    val writer = new BufferedWriter(new FileWriter(file))
    writer.write(needWriter)
    writer.close()

    line
  }
}
