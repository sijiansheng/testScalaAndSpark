package testscala.actor

import akka.actor.SupervisorStrategy.{Escalate, Stop, Restart, Resume}
import akka.actor.{OneForOneStrategy, Actor}
import org.omg.CORBA.Request

/**
  * Created by sijiansheng on 2016/4/7.
  */
class ExampleActor extends Actor {
  override val supervisorStrategy = OneForOneStrategy(maxNrOfRetries = 10){
    case _:ArithmeticException => Resume
    case _:NullPointerException=>Restart
    case _:IllegalArgumentException => Stop
    case _:Exception => Escalate
  }

//  override def receive: Receive = {
////    case Request(r)
//  }
  override def receive: Receive = ???
}
