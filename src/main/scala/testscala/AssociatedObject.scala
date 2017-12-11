package testscala

/**
  * Created by sijiansheng on 2016/3/30.
  */
class AssociatedObject {

  def prin = AssociatedObject.pr

  def prAdd = AssociatedObject.add()

  object AssociatedObject {
    var temp = 10
    temp = temp + 1

    def pr = this.temp

    def add(): Unit = {
      this.temp = temp + 1
    }
  }

}

object test {

  def main(args: Array[String]) {

    val associatedObject = new AssociatedObject
    println(associatedObject.prin)
    associatedObject.prAdd
    println(associatedObject.prin)


  }
}