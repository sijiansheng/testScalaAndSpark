package testscala.feature.scala

/**
  * Created by sijiansheng on 2016/8/1.
  */
class NoDef private[scala] {

  println("execute NoDef before")
  val testData = "testData"
  println("execute NoDef after")
}

object NoDefTest {

  def main(args: Array[String]) {
    val test = new NoDef
    print(test.testData)
  }
}