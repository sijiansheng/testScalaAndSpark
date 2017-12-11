package functionality.highfunction

/**
  * Created by sijiansheng on 2016/12/20.
  */
object Example3 {

  def sum(a: Int): Int => String = b => (a + b).toString //todo 如果转为java，应该如何表达

  //  def sum(a: Int): Int => String = b => new Function2[Int, Int, String] {
  //    def apply(a: Int): Function = c => new Function[Int,Int,String]{
  //
  //    }
  //  }

  def interval(a: Int): Int => String = b => (a - b).toString

}
