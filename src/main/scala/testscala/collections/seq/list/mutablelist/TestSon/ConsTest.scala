package testscala.collections.seq.list.mutablelist.TestSon

/**
  * Created by sijiansheng on 2016/12/20.
  */
object ConsTest extends App {

  //  println(List.clearOne(List(1, 2, 3, 4), 2))
  //  println(List(1, 2, 3, 4).toString)
  //  println(List.add(List(1, 2, 3, 4),5))
  //  println(List.foldRight(List(1, 2, 3, 4), 0)(_ + _))
  //  println(List.startWith(List(1, 2, 3, 4), List(2)))
  println(List.hasSubsequence(List(1, 2, 3), List(1, 2, 3)))
}

sealed trait List[+A] {

  override def toString: String =
    this match {
      case Nil => ""
      case Cons(x, xs) => x + "," + xs.toString
    }

}

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def clearOne[A](list: List[A], n: Int): List[A] =

    if (n <= 0) list
    else
      list match {
        case Nil => Nil
        case Cons(x, xs) => clearOne(xs, n - 1)
      }

  def add[A](list: List[A], x: A): List[A] = list match {
    case Nil => List(x)
    case _ => Cons(x, list)
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = // Utility functions
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: List[Int]) =
    foldRight(ns, 0)((x, y) => x + y)

  def product2(ns: List[Double]) =
    foldRight(ns, 1.0)(_ * _) // `_ * _` is more concise notation for `(x,y) => x * y`; see sidebar

  def startWith[A](l: List[A], prefix: List[A]): Boolean = (l, prefix) match {
    case (l, Nil) => true
    case (Cons(lx, lxs), Cons(x, xs)) if x == lx => startWith(lxs, xs)
    case _ => false
  }

  def hasSubsequence[A](list: List[A], detectionList: List[A]): Boolean = detectionList match {
    case Nil => true
    case _ if startWith(list, detectionList) => true
    case Cons(h, t) => hasSubsequence(t, detectionList)
  }

}