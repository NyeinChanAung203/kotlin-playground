fun main(){
    val cat = Cat()
    cat.eat()
    cat.sleep()


}

abstract class Animal{
   abstract fun eat()
   abstract fun sleep()
}


class Cat: Animal() {
    override fun eat() {
        println("Cat is Eating")
    }

    override fun sleep() {
        println("Cat is sleeping")
    }
}
