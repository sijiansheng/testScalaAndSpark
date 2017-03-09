package testscala

import java.util

/**
  * Created by sijiansheng on 2016/7/20.
  */
object MapTest extends App{

  val map: java.util.HashMap[String, String] = new util.HashMap[String, String]() {
    {
      put("1", "1")
    }
  }
}
