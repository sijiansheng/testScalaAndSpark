package testscala.system

/**
  * Created by sijiansheng on 2016/10/10.
  * //退出形式没有区别，都是系统关闭
  */
object TestSystemExit {

  def main(args: Array[String]) {
    println("测试异常退出")
    //    System.exit(0)
    System.exit(1)
    println("已经退出")

  }
}
