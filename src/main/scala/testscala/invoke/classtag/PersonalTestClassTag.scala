package testscala.invoke.classtag

import scala.reflect.ClassTag

/**
  * Created by sijiansheng on 2016/8/22.
  */
object PersonalTestClassTag {

  def mkArray[T: ClassTag](elems: T*): Array[T] = Array[T](elems:_*)

  def main(args: Array[String]) {
    //    implicit "12": ClassTag[String]

    mkArray(2,3).foreach(println)


  }
}
