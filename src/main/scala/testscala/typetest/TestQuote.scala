package testscala.typetest

import testscala.typetest.TestQuote.string2

/**
  * Created by sijiansheng on 2016/11/21.
  */
object TestQuote {

  type string2 = (String, String)


}

object OtherTest {

  //  var testData:string2=_ //如果string2是在class里的就无法引用
  var testData: string2 = _ //如果string2在object里就可以引用
}