package testscala.enumeration

/**
  * Created by sijiansheng on 2016/9/7.
  */
object TestEnumeration extends Enumeration {

  type sparkSubmitAction = Value
  val submit, kill, request_status = Value
}

object TestEnumerationApp extends App{

  println(TestEnumeration.maxId)
  println(TestEnumeration.submit.id)
  println(TestEnumeration.kill.id)
  println(TestEnumeration.request_status.id)
}