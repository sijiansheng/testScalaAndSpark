package testscala.function

/**
  * Created by sijiansheng on 2016/9/19.
  */
object FunctionApp extends App {

  val funs = new Function0[String] {

    def apply(): String = {
      println("执行apply方法")
       "test"
    }
  }

  println(funs())
}
