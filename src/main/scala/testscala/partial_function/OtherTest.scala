package testscala.partial_function

/**
  * Created by sijiansheng on 2016/10/27.
  */
trait Publisher[T] {
  def subscribe(f: PartialFunction[Int, String])
}

object OtherTest extends App {

//  val publisher: Publisher[Int] = _
//
//  publisher.subscribe {
//    case i if i < 10 => "found prime"
//    case i if i % 2 == 0 => "2"
//  }
//
//  publisher()

}
