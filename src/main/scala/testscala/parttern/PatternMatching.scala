package testscala.parttern

/**
  * Created by sijiansheng on 2016/4/14.
  */
object PatternMatching {
  abstract class A

  case class B(e: Int) extends A

  case class C(c: Int) extends A

  case class D(d: Int) extends A


  def main(args: Array[String]) {


// val a :A = B(1)
//  a match {
//    case a@B(_) =>println("eB(_):"+a+" _:"+_)
//    case a@C(_) =>println("eC(_):"+a+" _:"+_)
//    case a@D(_) =>println("eD(_):"+a+" _:"+_)
//  }
  }

}
