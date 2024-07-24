fun main(){
    val max = getMax(1,2)
    println(max)
    val max1 = getMax(1.9,1.2)
    println(max1)
    println(getMax(3,4,5))
}


fun getMax(a: Int, b: Int) = if(a > b) a else b
fun getMax(a: Double, b: Double) = if (a> b) a else b
fun getMax(a: Int,b: Int,c: Int): Int {
    return if(a>= b && a>=c){
        a
    }else if(b>=a && b>=c){
        b
    }else {
        c
    }
}