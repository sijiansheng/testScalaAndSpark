package testscala.collections.seq.nil

/**
  * Created by sijiansheng on 2016/10/17.
  */
object TestNil {

  def main(args: Array[String]) {

    val list = List(Nil)
    println(list.getClass)
    println(list)
    val newList = list.+:("12")
    println(newList)

  }
}
