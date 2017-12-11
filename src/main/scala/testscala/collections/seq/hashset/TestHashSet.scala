package testscala.collections.seq.hashset

import scala.collection.immutable.HashSet

/**
  * Created by sijiansheng on 2016/10/12.
  */
object TestHashSet {

  def main(args: Array[String]) {

    val hashSets = HashSet("10","20")
    println(hashSets("1"))
  }
}
