package testscala.logger

import org.apache.log4j.{Level, PropertyConfigurator}

/**
  * Created by sijiansheng on 2016/11/16.
  */
object lo4jTest {

  def main(args: Array[String]) {

    val logger = LoggerTest.logger
    //    LoggerTest.init()
    PropertyConfigurator.configure(getClass.getResource("/log4j.properties").getPath) //这段代码放到哪里执行可以起到效果，只要放到logger文件启动后，就可以
    //    =%-d{yyyy-MM-dd HH:mm:ss} %5p %c [%F:%L] %m%n
    //    2016-11-17 15:06:45  WARN LoggerTest [lo4jTest.scala:16] test warn
    //    %-d{yyyy-MM-dd HH:mm:ss} %5p %c [ %t:%r ] - [%F:%L]:%m%n
    //    2016-11-17 15:12:55  WARN LoggerTest [ main:8 ] - [lo4jTest.scala:18]:test warn
    logger.warn("test warn")
    logger.error("test error")
    logger.error("test error")
    logger.info("test info")
    logger.info("test info")
    logger.info("test info")
    try {
      println(2 / 0)
    } catch {
      case e: Exception =>
        LoggerTest.exception(e)
    }
    //
  }
}
