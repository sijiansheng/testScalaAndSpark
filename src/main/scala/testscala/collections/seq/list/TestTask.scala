package testscala.collections.seq.list

/**
  * Created by sijiansheng on 2016/11/10.
  */
object TestTask {

  def main(args: Array[String]) {

//    println(Bytes)
    val list = List(1,2,3,4,5)
    println(list.slice(0,2))
    println(list.slice(0,0))

    println(list.slice(0,1)++list.slice(2,4))

    List(1,2,3,4).map(1+_)
    Some(1,2).map(x=>x)
  }
}
