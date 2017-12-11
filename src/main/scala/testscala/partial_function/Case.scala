package testscala.partial_function

/**
  * Created by sijiansheng on 2016/10/27.
  */
object Case {

  def main(args: Array[String]) {

    val list = List("1" -> 1, "2" -> 2)
    val result = list.map { case (k, v) => k.toInt }
    result.foreach(println)

  }
}
