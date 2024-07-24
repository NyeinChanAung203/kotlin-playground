package Collections


fun main(){
    val footballPlayer1 = FootballPlayerX("player 1")
    val footballPlayer2 = FootballPlayerX("player 2")
    val footballPlayer3 = FootballPlayerX("player 3")

    val baseballPlayer1 = BaseballPlayerX("base player 1")

//    val team = TeamX("Football Team", mutableListOf())
//    val team = Team<FootballPlayer>("Football Team", mutableListOf())
//    team.addPlayer(footballPlayer1)
//    team.addPlayer(footballPlayer2)
//    team.addPlayer(footballPlayer2)
//
//    team.addPlayer(baseballPlayer1)

}
// multiple upperbound
class TeamX<T>(val name:String,val players: MutableList<in T>) where T: PlayerX, T: Listener{

    fun addPlayer(player: T){
        if(players.contains(player)){
            println("Player: ${player.name} is already in the team ${this.name}")
        }else{
            players.add(player)
            println("Player: ${player.name} was added in the team ${this.name}")
        }
    }
}

open class PlayerX(val name:String)
interface Listener{
    fun listen()
}

class FootballPlayerX(name:String): Player(name)
class BaseballPlayerX(name:String): Player(name)