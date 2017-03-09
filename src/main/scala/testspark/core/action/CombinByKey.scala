package testspark.core.action

/**
  * Created by sijiansheng on 2016/11/2.
  */
object CombinByKey {

  def main(args: Array[String]): Unit = {

    val sc = testspark.sparkContext //包对象，如果不想要testspark前缀，必须是该类所在的第一个父包，当前应该是core包下
    val input = sc.parallelize(List(1, 2, 4, 5, 6, 6, 7, 3, 2, 8, 23, 3), 4)
    val newIntput = input.coalesce(2)

    input.mean()
    input.sum()
    input.stdev()
    println(s"toDebugString:${input.toDebugString}")
    println(newIntput.count())
    println(input.partitions.length)
    println(newIntput.partitions.length)
    //    val result = input.

  }
}
