package testscala.actor

import akka.actor.{Props, ActorSystem, Actor}
import akka.event.Logging

/**
  * Created by sijiansheng on 2016/4/7.
  */
case object Swap

class Swapper extends Actor {
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case Swap =>
      while (true) log.info("Hi")
    case _ => while (true) log.info("couldn't find")
  }
}

object SwapperApp extends App {
  val system = ActorSystem("SwapperSystem")
  val swap = system.actorOf(Props[Swapper], name = "swapper")
  swap ! Swap
  swap ! " "
}
