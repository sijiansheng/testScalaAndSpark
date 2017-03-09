package testscala.recursion.factorial

/**
  * Created by sijiansheng on 2016/12/19.
  */
object FactrialTest {

  def main(args: Array[String]) {

    println(factrial(6))
    println(multiplication(2,6,factrial))
  }

  def factrial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }

    go(n, 1)
  }

  def multiplication(a: Int, b: Int, c: Int => Int): Int = {
    a * c(b)
  }

}
