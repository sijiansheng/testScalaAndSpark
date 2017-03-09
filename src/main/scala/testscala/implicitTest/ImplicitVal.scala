package testscala.implicitTest

import testscala.implicitTest.ImplicitVal.PersonOne

/**
  * Created by sijiansheng on 2016/11/21.
  */

object ImplicitVal {

  case class PersonOne(val age: Int, val name: String)

//  implicit val result: List[String] = person2List(PersonOne)

  def person2List(personOne: PersonOne): List[String] = {
    personOne.name.split(",").toList
  }

}

object ImplicitValApp {

  def main(args: Array[String]) {
    PersonOne(11, "12")
  }
}
