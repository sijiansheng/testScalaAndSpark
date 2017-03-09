package testscala


/**
  * Created by sijiansheng on 2016/9/8.
  */
object SimpleObject {

  var stringIndex = "旧字符串"
  this.stringIndex = "22"

  def changeString(): Unit = {
    this.stringIndex = "新字符串"
  }
}

object SimpleObjectApp extends App {

  println(SimpleObject.stringIndex)
  SimpleObject.changeString()
  println(SimpleObject.stringIndex)
  println(SimpleObject.stringIndex)
  println(SimpleObject.stringIndex)
  NewObjectApp.pr()
}

object NewObjectApp {

  def pr(): Unit = {
    println("newObjectApp:" + SimpleObject.stringIndex)
  }
}