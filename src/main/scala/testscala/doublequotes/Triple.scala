package testscala.doublequotes

/**
  * Created by sijiansheng on 2016/10/31.
  */
object Triple {

  def main(args: Array[String]) {

    val printValue1 = "<<>>"
     val printVaule2 =
       """<<>>
                   <<>>
                   {{}}
       """

    println(printVaule2)
  }
}
