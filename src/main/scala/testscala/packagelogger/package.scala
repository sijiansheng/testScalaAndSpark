package testscala

import org.apache.log4j.{BasicConfigurator, Logger, PropertyConfigurator}

/**
  * Created by sijiansheng on 2016/12/19.
  */
package object packagelogger {

  val logger = Logger.getLogger("PackageLoggerTest")
  BasicConfigurator.configure()
  PropertyConfigurator.configure(getClass.getResource("/log4j.properties").getPath)

  def exception[U <: Throwable](e: U) = {
    logger.error(e.getLocalizedMessage)
    logger.error(e)
    logger.error(e.getStackTraceString)
  }
}
