package testscala.invoke.classtag

import scala.reflect.ClassTag

/**
  * Created by sijiansheng on 2016/8/22.
  */

class A[T]

object Manifest_ClassTag {

  def main(args: Array[String]): Unit = {
    //通过Manifest这种上下文界定可以创建一个泛型数组
    //Mainifest在运行时存储数组的具体类型,Mainifest实际上作为一个隐式的参数运行在上下文中
    def arrayMake[T: Manifest](first: T, second: T) = {
      val r = new Array[T](2)
      r(0) = first
      r(1) = second
      r
    }

    arrayMake(1, 2).foreach(println)

    //不推荐如下写法,推荐上面的写法
    def manif[T](x: List[T])(implicit m: Manifest[T]) = {
      if (m <:< manifest[String]) //m是manifest[String]的类型
        println("List string")
      else
        println("Some other type")
    }
    manif(List("spark", "Hadoop"))
    manif(List(1, 2))
    manif(List("Scala, 3"))

    //最最常用的是ClassTag,用来代替manifest
    //运行时确定在编译时无法确定的类型
    def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)
    mkArray(2, 5).foreach(println)
    mkArray("hello", "world").foreach(println)

    //manifest和classManifest在spark中基本没用,不推荐
    val m = manifest[A[String]]
    println(m)
    val cm = classManifest[A[String]]
    println(cm)
  }
}