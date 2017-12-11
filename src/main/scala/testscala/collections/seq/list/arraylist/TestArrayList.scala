package testscala.collections.seq.list.arraylist

import java.util

/**
  * Created by sijiansheng on 2016/12/5.
  */
object TestArrayList {

  def main(args: Array[String]) {

    val arrayList = new util.ArrayList[String]()

    for(i<-0 to 10){
      arrayList.add(i.toString)
    }
    println(arrayList.toString)
  }

}
