package testscala.collections.tree

import testscala.TestType.People

/**
  * Created by sijiansheng on 2016/12/23.
  */
object TreeTest extends App {

  //  println(Tree.size(new Branch(Leaf(1), Leaf(2))))
  //  println(Tree.maxinum(new Branch(Leaf(1), new Branch(Leaf(2), Branch(Leaf(1), Leaf(5))))))
  println(Tree.depth(new Branch(Leaf(1), new Branch(Leaf(2), Branch(Leaf(3), Leaf(5))))))
}

sealed trait Tree[+A]

case class Leaf[A](value: A) extends Tree[A]

case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree {

  /**
    * the num of the tree
    *
    * @param t order tree
    * @tparam A type
    * @return num
    */
  def size[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 1
    case Branch(l, r) => 1 + size(l) + size(r)
  }

  //  def maxinum[A <: People](t: Tree[A]): A = t match {
  //    case Leaf(n) => n
  //    case Branch(l, r) =>
  //      //      if (maxinum(l) >= maxinum(r)) maxinum(l) else maxinum(r)
  //      maxinum(l).max(maxinum(r))
  //  }

  def depth[A](t: Tree[A], n: Int): Int = t match {
    case Leaf(_) =>
      n

    case Branch(l, r) =>
      depth(l, n + 1) max depth(r, n + 1)
  }


  def depth[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 0
    case Branch(l, r) => 1 + (depth(l) max depth(r))
  }

  def insert(a: Int, t: Tree[Int]): Unit =
    t match {
      case Leaf(la) => if (a < la) Branch(Leaf(a), t)
      case Branch(l, r) => insert(a, l)
    }

  //  def depth[A](t: Tree[A]): Int = depth(t, 0)


  def maxinum(t: Tree[Int]): Int = t match {
    case Leaf(n) => n
    case Branch(l, r) =>
      //      if (maxinum(l) >= maxinum(r)) maxinum(l) else maxinum(r)
      maxinum(l) max maxinum(r) //todo max是richint里的方法，为什么Int可以实现，是如何实现的，为什么可以不用括号，不是应该 maxinum(l).max(maxinum(r))吗，我发现这个方法是在scala.runtime这个包下的，会不会跟这个有关系
  }

  // todo 有机会学学二叉树算法
  //  def depth[A](t:Tree[A])
}

//extends class which have params muster extends it's param
//class Yang(age: Int, high: Double) extends People(age: Int, high: Double) {
//
//}

//object People {
//  def apply(age: Int, high: Double) = new People(age, high)
//}
//
//class People(age: Int, high: Double) {
//  def +(y: Yang): People = new People(this.age + y.age, this.high + y.high)
//
//  def max[A <: People](p: A): A = if (this.age > p.age) this.asInstanceOf[A] else p
//}