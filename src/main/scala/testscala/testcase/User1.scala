package testscala.testcase

/**
  * Created by sijiansheng on 2016/10/24.
  */
trait User1 {
  def name: String
}

class PremiumUser1(val name: String, val age: String) extends User1

object PremiumUser1 {
  def unapply(user: FreeUser): Option[String] = Some(user.name)
}

class FreeUser1(val name: String, val age: String, val upgradeProbability: Double) extends User1

object FreeUser1 {
  def unapply(user: FreeUser): Option[String] = Some(user.name)
}


object TestApp1 extends App {

  val user1: User1 = new FreeUser1("sijiansheng", "12", 1.2)

  user1 match {
    case FreeUser1(name) =>
      println(name)
    case PremiumUser1(name) =>
      println(name)
  }

}
