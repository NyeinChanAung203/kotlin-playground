// add open keyword to be inheritance
open class Vehicle(val name:String, val color:String){
    open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name is stop")
    }
}

class CarX(val engine:String,val doors:Int,name: String,color: String): Vehicle(name,color) {
    // if you want to override add open keyword to it original
    // add override keyword
    override fun move(){
        super.move()
        println("Car $name is moving")
    }
}


fun main(){
    val car = CarX("E-engine",4,"BMW","Blue")
    car.move()
    car.stop()
    println("${car.name} ${car.color}")
}