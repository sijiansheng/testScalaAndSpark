package functionality.functioncombination

/**
  * Created by sijiansheng on 2016/12/20.
  */
object Example1 {

  def complement[A](predicate: A => Boolean) = (a: A) => !predicate(a)
}
