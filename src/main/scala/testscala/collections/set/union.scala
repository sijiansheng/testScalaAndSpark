package testscala.collections.set

/**
  * Created by sijiansheng on 2016/11/9.
  */
object union extends App{

  val set1 = Set("1","4","3")
  val set2 = Set("2","3")

  val set3 = set1|set2
  val set4 = set1++set2
  println(set3)
  println(set4)
}
