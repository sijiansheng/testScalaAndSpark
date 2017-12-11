package testscala.dry

/**
  * Created by sijiansheng on 2016/12/14.
  */
object TestDry {

  //  def main(args: Array[String]) {
  //
  //
  //  }
  case class Email(subject: String, text: String, sender: String, recipient: String)

  type EmailFilter = Email => Boolean

  def newMailsForUser(mails: Seq[Email], f: EmailFilter) = mails.filter(f)
}
