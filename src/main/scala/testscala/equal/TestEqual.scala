package testscala.equal

/**
  * Created by sijiansheng on 2017/2/21.
  */
object TestEqual {

  def main(args: Array[String]) {

    val a: String = new String("sdf")
    val b = "sdf"
    val b1 = new String("sdf")
    val c = a
    val ai = 1
    val bi = 1
    val ci = ai

    //判断==是比较内存地址还是其他，第一次试验跟实际的有差距 todo 特别疑惑，如果是比较内存地址是否相同，a和b以及a和b1的内存地址其实是不相同的，为什么==回返回true
    println(a == b) //p: false a:ture
    println(a == c) //p: ture  a:true
    println(ai == bi) //p: true  a:true
    println(ai == ci) //p: true  a:true
    println(a == b1) //p:false a:true
    println(a.equals(b1))
  }
}
