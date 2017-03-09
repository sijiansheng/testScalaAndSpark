package testscala.feature.scala

/**
  * Created by sijiansheng on 2016/6/3.
  * 协变的定义和逆变的定义
  */
class Contravaiance {
}

class Animal {}

class Bird extends Animal {}

class SmallBird extends Bird {}

class Consumer[T](t: T) {}

//不变

class Consumer1[+T](t: T) {}

//协变

class Consumer2[-T](t: T) {}

//逆变

class Test extends App {
  val c3: Consumer[Animal] = new Consumer[Animal](new Bird)
  val c: Consumer[Bird] = new Consumer[Bird](new Bird)
  //  此时c不能赋值给c1,因为 Consumer 定义成不变类型。
  //  val c3:Consumer[Animal] = new Consumer[Bird](new Bird)

  val c1: Consumer1[Animal] = new Consumer1[Bird](new Bird)
  //此时c1可以赋值给c11，因为consumer1被定义为协变类型

  val c2: Consumer2[Bird] = new Consumer2[Animal](new Animal)
  //此时c2可以赋值给c21,因为Cousumer2定义为逆变类型
}

//1） U >: T
//
//这是类型下界的定义，也就是U必须是类型T的父类(或本身，自己也可以认为是自己的父类)。
//
//2) S <: T
//
//这是类型上界的定义，也就是S必须是类型T的子类（或本身，自己也可以认为是自己的子类)。
object TestShangjie {

  def getTClass[T <: Bird](animal: T): String = {

    animal.getClass.toString
  }

    def main(args: Array[String]) {

    val smallBird = new SmallBird()
    val animal = new Animal
    println(getTClass(smallBird))
    //    println(getTClass(animal))
  }
}
