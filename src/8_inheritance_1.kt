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

    val smartTv = SmartTvDevice("Device Name","samsung")
    println( smartTv.deviceName + smartTv.deviceCategory)
}

open  class SmartDevice(val name: String,val category: String){
    open fun turnOn(){}
    fun turnOff(){}
}

class SmartTvDevice(val deviceName: String,val deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

        override fun turnOn(){
            println("SmartTvDevice is turn on")
        }

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }
}