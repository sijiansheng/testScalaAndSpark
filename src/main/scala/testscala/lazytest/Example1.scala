package testscala.lazytest

/**
  * Created by sijiansheng on 2016/12/20.
  */
object Example1 {

  lazy val result: Int = initReuslt(1)
  val temp = 2
  println("执行example1静态方法")

  def initReuslt(a: Int) = {
    println("执行初始化initResult方法")
    a * 10
  }

}

object Example1App{

  def main(args: Array[String]) {

    println(Example1.temp)
    println(Example1.result)

  }
}
