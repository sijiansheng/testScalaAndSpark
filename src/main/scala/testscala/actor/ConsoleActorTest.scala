package testscala.actor


import akka.actor.{ActorLogging, Props, ActorSystem, Actor}
import akka.event.Logging

import scala.util.Random

/**
  * Created by sijiansheng on 2016/4/13.
  */
case class QuoteRequest()

case class QuoteResponse(quoteString: String)

object ConsoleActorTest extends Actor with ActorLogging{
  val quotes = List("第一天", "第二天", "第三天")

  override def receive: ConsoleActorTest.Receive = {

    case "第一天" => val quoteResponse =
      log.info("第一天")
    case _ =>  log.info("other")

  }

}

object TestActor2 {
  def main(args: Array[String]) {

    val refActorSystem = ActorSystem.create("createMessage")
    val refActor = refActorSystem.actorOf(Props(ConsoleActorTest), name = "consoleActorTest")
    val refActor1 = refActorSystem.actorOf(Props(ConsoleActorTest), name = "consoleActorTest1")
    val refActor2 = refActorSystem.actorOf(Props(ConsoleActorTest), name = "consoleActorTest2")
    refActor ! "第一天"
    Thread.sleep(20000)
    refActor1 ! "第一天"
    refActor2 ! "第一天"
    refActorSystem.shutdown()

  }
}