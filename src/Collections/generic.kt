package Collections


fun main(){
    val footballPlayer1 = FootballPlayer("player 1")
    val footballPlayer2 = FootballPlayer("player 2")
    val footballPlayer3 = FootballPlayer("player 3")

    val baseballPlayer1 = BaseballPlayer("base player 1")

    val team = Team("Football Team", mutableListOf())
//    val team = Team<FootballPlayer>("Football Team", mutableListOf())
    team.addPlayer(footballPlayer1)
    team.addPlayer(footballPlayer2)
    team.addPlayer(footballPlayer2)

    team.addPlayer(baseballPlayer1)

//    val team2 = Team<Player>("Team", mutableListOf<FootballPlayer>(footballPlayer3))
}

// T extends Player that why we can add both baseball player and football player
// class Team<T>(val name:String,val players: MutableList<T>){
// class Team<T: Player>(val name:String, val players: MutableList<out T>){

// ** Covariance and Contravariance
// out is covariance -> that is accept all subclasses of super/parent
// in is contravariance -> that is accept all the super classes of subclass/child
//class Team<T: Player>(val name:String,val players: MutableList<out T>){
class Team<T: Player>(val name:String,val players: MutableList<T>){

    fun addPlayer(player: T){
        if(players.contains(player)){
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        }else{
            players.add(player)
            println("Player: ${(player as Player).name} was added in the team ${this.name}")
        }
    }
}

open class Player(val name:String)

class FootballPlayer(name:String): Player(name)
class BaseballPlayer(name:String): Player(name)