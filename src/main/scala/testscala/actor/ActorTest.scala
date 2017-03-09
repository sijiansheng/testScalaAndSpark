package testscala.actor

import akka.actor.{ActorSystem, Actor, Props}
import akka.event.Logging


/**
  * Created by sijiansheng on 2016/4/1.
  */
case class Ac()

class ActorTest extends Actor {
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case Ac => while (true) log.info("Hi")
    case _ => log.info("received unknown meessage")
  }

}

object TestApp extends App {

  val system = ActorSystem("testActor")
  val pops1 = system.actorOf(Props[ActorTest], name = "pops1")
//  val pops2 = system.actorOf(Props[ActorTest], name = "pops2")
  pops1 ! Ac
//  pops2 ! "other"

}




