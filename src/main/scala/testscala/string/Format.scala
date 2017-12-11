package testscala.string

/**
  * Created by sijiansheng on 2016/10/31.
  */
object Format {

  val printlnStream = System.err
  val warnStream = System.out
  def main(args: Array[String]) {

    val needFormatData = "12 %s"
    printlnStream.println(needFormatData.format("data"))
  }
}
