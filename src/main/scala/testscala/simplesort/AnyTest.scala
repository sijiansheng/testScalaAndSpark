package testscala.simplesort

import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator

/**
  * Created by sijiansheng on 2016/4/13.
  */
object AnyTest {
  def main(args: Array[String]) {
    val a = null
    val testAny = "SDf"
    testAny match {
      case "d" => println("ref")
      case _ => println("other")
    }

  }
}
