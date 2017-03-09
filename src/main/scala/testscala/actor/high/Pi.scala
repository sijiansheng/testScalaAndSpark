package testscala.actor.high

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.event.Logging
import akka.routing.RoundRobinRouter


/**
  * 测试 scala actor
  * Created by sijiansheng on 2016/4/14.
  */
object Pi extends App {

  calculate(10, 10000, 10000)

  def calculate(nrOfWorkers: Int, nrOfElements: Int, nrOfMassages: Int) {
    val system = ActorSystem("piSystem")
    val listener = system.actorOf(Props[Listener], name = "listener")

    val master = system.actorOf(Props(new Master(nrOfWorkers, nrOfMassages, nrOfElements, listener)), name = "master")

    master ! Calculate
  }
}

sealed trait PiMessage

case object Calculate extends PiMessage

case class Work(start: Int, nrOfElements: Int) extends PiMessage

case class Result(value: Double) extends PiMessage

case class PiApproximation(pi: Double, needTiem: Long)

class Worker extends Actor {
  override def receive: Receive = {
    case Work(start, noOfElements) =>
      sender ! Result(calculatePiFor(start, noOfElements))
  }

  def calculatePiFor(start: Int, nrOfElements: Int): Double = {
    var acc = 0.0
    for (i <- start until (start + nrOfElements)) {
      acc += 1.0 * (1 - (i % 2) * 2) / (2 * i + 1)
    }
    acc
  }


}

class Master(nrOfWorkers: Int, nrOfMessage: Int, nrOfElements: Int, listener: ActorRef) extends Actor {
  var pi: Double = _
  var nrOfResults: Int = _
  val start: Long = System.currentTimeMillis

  val workerRouter = context.actorOf(Props[Worker].withRouter(RoundRobinRouter(nrOfWorkers)), name = "workerRouter")

  override def receive: Receive = {
    case Calculate =>
      for (i <- 0 until nrOfMessage) workerRouter ! Work(i * nrOfElements, nrOfElements)
    case Result(value) =>
      pi += value
      nrOfResults += 1
      if (nrOfResults == nrOfMessage) {
        listener ! PiApproximation(pi, System.currentTimeMillis - start)
        context.stop(self)
      }
  }
}

class Listener extends Actor {
  def receive = {
    case PiApproximation(pi, needTime) =>
      val log = Logging(context.system, this)
      log.info("\n\t Pi approximations:\t\t%s\n\t Calculation time:\t\t%s".format(4.0 * pi, needTime))
      context.system.shutdown
  }
}

