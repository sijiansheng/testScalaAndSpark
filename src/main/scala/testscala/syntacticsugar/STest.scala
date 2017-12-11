package testscala
package syntacticsugar

import java.{util => test}

// import java.{util=>test}代表对包起别名
/**
  * Created by sijiansheng on 2016/12/12.
  */
abstract class STest[A](op: => A) {

  def main(args: Array[String]) {

//    test.equals()
  }

  val a:Integer

  def asJava: A = op
}
