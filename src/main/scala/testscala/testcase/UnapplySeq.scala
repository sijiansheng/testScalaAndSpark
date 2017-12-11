package testscala.testcase

/**
  * Created by sijiansheng on 2016/10/24.
  */
class GiverNames(name1: String)
object GiverNames{
  def unapply(name:String):Option[Seq[String]]={
    val names = name.trim.split(" ")

    if(names.forall(_.isEmpty)) None
    else Some(names)
  }
}

object UnapplySeq extends App {

// def greetWithFirstName(name:String)= name match{
//   case GiverNames(firstName,_*) => s"good morning $firstName"
//   case _=>
// }


}
