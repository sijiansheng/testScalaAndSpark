package testscala.collections.iterator

/**
  * Created by sijiansheng on 2016/11/18.
  */
object TestIterator extends App {

  val iterator_ = Iterator(1, 2, 3, 4, 5, 6)
  val iterator = iterator_.toList

  println("第一个")
  iterator.foreach(x => println(x))
  println("第二个")
  iterator.foreach(x => println(x))
  println("第三个")
  iterator.foreach(x => println(x))

}
