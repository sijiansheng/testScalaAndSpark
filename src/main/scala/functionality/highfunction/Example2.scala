package functionality.highfunction

/**
  * Created by sijiansheng on 2016/12/20.
  */
object Example2 {

  def main(args: Array[String]) {

    def sumFunction(a: Int, b: Double) = (a + b).toString
    sum(1, sumFunction)(2)
    //为什么有的方法传两个参数得到了解决，因为返回值也是函数
  }

  def sum[A, B, C](a: A, f: (A, B) => C): B => C = b => f(a, b)
}
