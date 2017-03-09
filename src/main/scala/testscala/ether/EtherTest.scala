package testscala.ether

import java.net.URL

import scala.io.Source

/**
  * Created by sijiansheng on 2016/12/9.
  */
object EtherTest {

  def main(args: Array[String]) {

  }

  def getContent(url: URL): Either[String, Source] = {

    if (url.getHost.contains("google")) {
      Left("requested url is blocked for the good of the people!")
    } else {
      Right(Source.fromURL(url))
    }
  }
}
