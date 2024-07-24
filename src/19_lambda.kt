fun main(){
    // function as a parameter = Higher order function


    val myLambda = {a: Int,b:Int -> a* b}
    val myLambda2 : (Int,Int)-> Unit  = {a: Int,b:Int -> println(a + b) }
    println( myLambda(2,3))
    myLambda2(3,5)


    val action = {c:Int -> println(c*c)}
    addNumbers(2,4,action)
    println()

    addNumbers(4,5){ c: Int -> println(c) }
    println()
    // you can use it instead of parameter --> c:Int->blah...
    addNumbers(2,2){ println("result: $it") }
    println()


    //
    val myobj = MyClassX()
    var result = with(myobj){
        name= "New Name"
        age = 12
        this // the last line is the return type/object
    }

    val myobj2 = MyClassX().apply {
        name = "test"
        age=  94
    }

}

fun addNumbers(a: Int,b:Int,action:(Int)->Unit): Unit{
    action(a+b)
}

class MyClassX{
    var name=""
    var age=0
}