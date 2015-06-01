import akka.actor._
import com.typesafe.config.ConfigFactory
 
// remote
object RemoteMain {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("application.remote.conf")
    
    val system = ActorSystem("RemoteActor", config)

    val actor = system.actorOf(Props[RemoteActor], "remoteActor")

    // localから送信
    actor ! "from local"
  }
}
