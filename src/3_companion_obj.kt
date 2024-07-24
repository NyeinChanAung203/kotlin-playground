class Calculator {
    companion object{
        fun sum(a: Int, b: Int) = a+b
    }
}


fun main(){
    println( Calculator())
    println( Calculator.sum(2,4))
}