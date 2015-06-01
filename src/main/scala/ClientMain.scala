import akka.actor._
import com.typesafe.config.ConfigFactory

// client
object ClientMain {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("application.client.conf")
    val system = ActorSystem("Client", config)
   
    // actorSelectionで呼び出す方法
    val remoteActor = system.actorSelection("akka.tcp://RemoteActor@127.0.0.1:2552/user/remoteActor")
    remoteActor ! "[actorSelection] from client"
   
    // config から読み込む方法
    val remoteActorFromConf = system.actorOf(Props[RemoteActor], "remoteActor")
    remoteActorFromConf ! "[config] from client"

    Thread.sleep(3000)
    system.shutdown()
  }
}
