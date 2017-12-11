package testscala.testcase

/**
  * Created by sijiansheng on 2016/10/20.
  */
trait User {
  def name: String

  def age: String
}

class PremiumUser(val name: String, val age: String) extends User

object PremiumUser {
  def unapply(user: FreeUser): Option[(String, String)] = Some(user.name, user.age)
}

class FreeUser(val name: String, val age: String, val upgradeProbability: Double) extends User

object FreeUser {
  def unapply(user: FreeUser): Option[(String, String, Double)] = Some(user.name, user.age, user.upgradeProbability)
}


object TestApp extends App {

  val user: User = new FreeUser("sijiansheng", "12", 1.2)

  user match {
    case FreeUser(name, a, p) =>
      println(name + a + p)
    case PremiumUser(name, a) =>
      println(name)
  }

}
