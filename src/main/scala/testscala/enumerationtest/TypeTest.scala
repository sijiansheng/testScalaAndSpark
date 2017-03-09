package testscala.enumerationtest

import testscala.enumerationtest.TypeTest.TypeTest

/**
  * Created by sijiansheng on 2016/10/31.
  */
object TypeTest extends Enumeration{

  type TypeTest = Value

  val red,black,orange = Value
}

object TypeTestApp extends App{

  var value:TypeTest = _
}
