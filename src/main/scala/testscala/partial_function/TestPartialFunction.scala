package testscala.partial_function

/**
  * Created by sijiansheng on 2016/10/26.
  */
object TestPartialFunction {

  //  p1
  //  def p1: PartialFunction[Int, Int] = {
  //    case x if x > 1 => 1
  //  }

  //  def main(args: Array[String]) {
  //
  //    val pf: PartialFunction[Int, String] = {
  //      case i if i % 2 == 0 => "event"
  //    }
  //
  //    val tf: (Int => String) = pf orElse { case _ => "old" }
  //    //    println(pf(4))
  //    println(tf(2))
  //    println(tf(1))
  //  }
  //
  //  def getDivider(x: Int) = 42 / x

//  val fraction = new PartialFunction[Int, Int] {
//
//    def apply(d: Int) = 42 / d
//    def isDefinedAt(d: Int) = d != 0
//  }
//
//  def main(args: Array[String]) {
//   println(fraction(1))
//  }
val map = List(0,1,2)


}
