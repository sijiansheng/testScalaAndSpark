package testscala.feature.scala

/**
  * Created by sijiansheng on 2016/6/3.
  */
class LowerBoundsAndUpperBounds {
}

class Animal1 {
}

class Bird1 extends Animal1 {
}

class Consumer4[+T](t:T){
//  def use(t: T) ={} "Covariant type T occurs in contravariant position in type T of value t"。但是如果返回结果为类型参数则没有问题。
//  def get():T={new T}
}

//为了在方法中使用类型参数，需要定义下界
class Cousumer5[+T](t:T){
def use[U>:T](u:U)={println(u)}
}

class Consumer6[-T](t:T){
//  def get[U<:T]():U={new U}
}
//可以看到方法的返回值是协变的位置，方法的参数是逆变的位置


