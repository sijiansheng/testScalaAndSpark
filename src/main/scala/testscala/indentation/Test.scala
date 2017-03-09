package testscala.indentation

/**
  * Created by sijiansheng on 2016/10/27.
  */
object Test {

  def main(args: Array[String]) {

    println(test)

  }

  def test: Int = {

    val divide = new PartialFunction[Int, Int] {

      def apply(x: Int) = 42 / x

      def isDefinedAt(x: Int) = x != 0
    }

    divide(5)
  }

}
