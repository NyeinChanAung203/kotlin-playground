fun main(){
    var name1 = "nyein"
    var name2 = "nyein"
    println(name1 == name2)
    println(name1 === name2)
    println()
    val x = EqualX(1,2)
    val y = EqualX(1,2)
    println(x == y)
    println(x === y)
    println(x.equals(y))

    println()
    println(x.hashCode() == y.hashCode())

    println()
    println(x)
}

class EqualX(val x:Int,val y:Int){
    override fun equals(other: Any?): Boolean {
        if(this === other){
            return true
        }
        if(other is EqualX){
            return other.x == this.x && other.y == this.y
        }
        return  false
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Equalx(x:$x,y:$y)"
    }
}