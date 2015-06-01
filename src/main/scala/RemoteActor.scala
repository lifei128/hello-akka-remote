import akka.actor._

class RemoteActor extends Actor {
  def receive = {
    case x => println("message: " + x)
  }
}
