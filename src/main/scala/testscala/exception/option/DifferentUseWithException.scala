package testscala.exception.option

/**
  * Created by sijiansheng on 2016/12/26.
  */
object DifferentUseWithException {

  def divisor2(a: Int): Option[Int] = {

    var result: Option[Int] = None

    try {
      result = Some(6 / a)
    } catch {
      case e: Exception => None
    }

    result
  }

  def try1[A](a: => A): Option[A] =
    try Some(a)
    catch {
      case e: Exception => None
    }

  def divisor(a: Int): Option[Int] = Some(6 / a)

  val divisor1: Option[Int] => Option[Int] = lift(x => 6 / x)

  def lift[A, B](f: A => B): Option[A] => Option[B] = _ map f //只是将方法封装而已

  def main(args: Array[String]) {

    println(divisor(2))
    //    println(divisor1()) todo 还是有点不懂，如何实现，如何利用
    println(divisor2(2))
    //println(divisor(0))
    //出现异常信息，option只是用来替代抛异常，而不是将原来的异常处理掉
    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //    at testscala.exception.option.DifferentUseWithException$.divisor(DifferentUseWithException.scala:8)
    //    at testscala.exception.option.DifferentUseWithException$.main(DifferentUseWithException.scala:18)
    //    at testscala.exception.option.DifferentUseWithException.main(DifferentUseWithException.scala)
    //    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    //    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    //    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    //    at java.lang.reflect.Method.invoke(Method.java:498)
    //    at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)

    //    println(divisor1(Option(0)))
    println(divisor2(0))
  }

}
