package testscala.logger

import org.apache.log4j.{Level, _}
import org.apache.log4j.helpers.LogLog

/**
  * Created by sijiansheng on 2016/11/16.
  */
object LoggerTest {

  val logger = Logger.getLogger("LoggerTest")
  PropertyConfigurator.configure(getClass.getResource("/log4j.properties").getPath)

  def exception[T <: Throwable](e: T): Unit = {
    logger.warn(e.getLocalizedMessage)
    logger.warn(e)
    logger.warn(e.getStackTraceString)
  }

}
