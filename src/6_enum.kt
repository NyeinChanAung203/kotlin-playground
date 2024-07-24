enum class Direction(var direction:String, var distance: Int){
    NORTH("north",12),
    EAST("east",1),
    WEST("west",2),
    SOUTH("south",8);

    fun printData(){
        println("Direction $direction,distance: $distance")
    }
}

fun main(){
    Direction.EAST.printData()
    for (i in Direction.values()){
        println(i)
    }
    val d  = Direction.valueOf("east".uppercase())
    when(d){
        Direction.EAST -> println("East ..")
        Direction.SOUTH -> println("south ..")
        Direction.WEST -> println("west ..")
        Direction.NORTH -> println("north ..")
    }
}
