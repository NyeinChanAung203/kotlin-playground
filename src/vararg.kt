fun main(){
    println(sum(1,2,3,4,5))
    println(multiply(1,2,3,4,5))
}

fun sum(vararg numbers: Int): Int{
    var result = 0
    for (i in numbers){
        result += i
    }
    return result
}

fun multiply(vararg numbers: Int):Int{
    var result = 1
    numbers.forEach { result *=it }
    return  result
}