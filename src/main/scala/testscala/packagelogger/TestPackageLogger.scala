package testscala.packagelogger

/**
  * Created by sijiansheng on 2016/12/19.
  */
object TestPackageLogger {

  def main(args: Array[String]) {

    logger.warn("警告")
    logger.error("错误")

    try{
      println(args(0))
    }catch {
      case e:Exception=>
        exception(e)
    }

  }

}
