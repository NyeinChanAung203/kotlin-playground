fun main(){
    val b1 = Bottle("life",12)
    val b2 = Bottle("life",12)
    println(b1)
    println(b2)
    println(b1 == b2)
    println(b1.copy("alpine"))
}

// data class is automatically generate equals,hashCode and toString method
data class Bottle(val name:String,val size:Int)