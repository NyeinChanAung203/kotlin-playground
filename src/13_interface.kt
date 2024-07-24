
fun main(){
    val c = CycleX("scoopy","black")
    c.startEngine()
    val car = CarW("BMW","2019")
    car.startEngine()
}

interface Engine{
    fun startEngine()
}

class CycleX(val name:String,val color: String):Engine{
    override fun startEngine() {
        println("Cycle $name is starting an engine")
    }
}

class CarW(val name:String,val modal:String):Engine{
    override fun startEngine() {
        println("Carw $name start engine")
    }
}