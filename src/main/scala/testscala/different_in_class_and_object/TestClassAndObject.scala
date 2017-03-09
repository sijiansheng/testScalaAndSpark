package testscala.different_in_class_and_object

/**
  * Created by sijiansheng on 2016/9/19.
  */
class TestClassAndObject {

  var countNumber = 10

}

object TestClassAndObject {

  var instance: TestClassAndObject = _

  def apply() = {
    println("执行apply方法")
    instance = new TestClassAndObject()
    instance
  }

}

object TestClassAndObjectApp extends App {

    val newInstance = TestClassAndObject()
    println(newInstance.countNumber)
    newInstance.countNumber += 1
    println(newInstance.countNumber)

    val instanceTwo = TestClassAndObject
    println(instanceTwo.instance.countNumber)

//  val newInstance = TestObjectAndClassTwo()
//  println(newInstance.countNumber)
//  newInstance.countNumber += 1
//  println(newInstance.countNumber)
//
//  val instanceTwo = TestObjectAndClassTwo()
//  println(instanceTwo.countNumber)

}


class TestObjectAndClassTwo {
  var countNumber = 10
}

object TestObjectAndClassTwo {

  def apply() = {
    println("执行apply方法")
    new TestClassAndObject()
  }
}
