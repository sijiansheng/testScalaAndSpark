package testscala

import testscala.TestType.s


/**
  * Created by sijiansheng on 2016/9/7.
  * 如果type是在class里的，只能在本class中使用，如果其他类也要使用，可以把他放到包对象里，如果type是在object中的，其他类也可以引用
  * 测试type的使用
  * 1.声明类型
  * 2.用于抽象类型
  * 3.操作命名
  */
class Person(val age: Int) {
}

object TestType extends App {

  //1.声明类型
  type s = String
  type T = Serializable {
    type X
    def fooxt(): Unit
  }

  //2.
  val b = new B
  b.foo(200)
  val c = new C
  c.foo("12")

  //3.
  //起别名
  type People = List[Person]

  def teenagersPeople(people: People): People = {
    people.filter(person => person.age < 20)
  }

  //操作命名
  type PersonPredicate = Person => Boolean

  val teenagerPred: PersonPredicate = person => person.age < 20

  def teenagers(people: People): People = {
    people.filter(teenagerPred)
  }

  val boy = new Person(12)
  val tempPerson = List(boy)
  teenagers(tempPerson).foreach(println)
}


trait A {
  type T

  def foo(i: T) = println(i)
}

class B extends A {
  type T = Int

}

class C extends A {
  type T = String
}

object TempTest {

  def main(args: Array[String]): Unit = {

    //        type Test = Person => Boolean
    //        val b: Test = person => person.age > 100
    //    val

    type TestType = Person => String
    val personString: TestType = person => person.age.toString

    val person = new Person(100)
    val person1 = new Person(1001)
    val list = List(person, person1)
    list.map(personString).foreach(println)

    val testValue:s = ""
  }
}