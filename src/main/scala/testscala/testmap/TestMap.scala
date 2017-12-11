package testscala.testmap

import scala.collection.mutable

/**
  * Created by sijiansheng on 2016/9/21.
  */
case class Test(val te:String)
object TestMap extends App {

  val map = mutable.Map[Int, Int]()
  map.put(2,11)
//  map += (2 -> 12)
//  map += (3 -> 13)
//  val orNull = map.get(4).orNull
//  val orNull1 = map.getOrElse(4, Test)
//  println(orNull1.getClass)
//  println(map)
//  println(map(1))
//  println(map.get(4).orNull)
}
