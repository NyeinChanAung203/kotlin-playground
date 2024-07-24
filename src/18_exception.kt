fun main(){
    val a = 4
    val b = 0

    try {
        println(a/b)
    }catch (e: Exception){
        println(e)
        println("You cannot divided by zero")
    }finally {
        println("done")
    }

}