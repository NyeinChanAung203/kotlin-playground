fun main(){
    val app = App()
    app.printA()
    app.printB()
}

/// delegation means giving power or authority from one class to another
/// usually use in scenarios where inheritance start to break [ inheritance from two class ]
/// [only inheritance from one class]


class App: A by FirstDelegation(), B by SecondDelegation() {
    // you can override again
//    override fun printA() {
//        TODO("Not yet implemented")
//    }
}

interface  A{
    fun printA()
}

interface B{
    fun printB()
}

open class FirstDelegation: A{
    override fun printA() {
        TODO("Not yet implemented")
    }
}
open class SecondDelegation: B{
    override fun printB() {
        TODO("Not yet implemented")
    }
}