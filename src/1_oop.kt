
class Car{
    var model = ""
    var color = ""
}

class Cycle(model:String, color: String){
    var model = model
    var color = color
}

class Bike(var model:String,var color:String)


fun main(){
    val c = Car()
    c.model = "c-model"
    c.color = "blue"
    println("${c.model} ${c.color}")

    val cycle = Cycle("d-model","red")
    println("${cycle.model} ${cycle.color}")

    val bike = Bike("b-model","yellow")
    println("${bike.model} ${bike.color}")

    println(sum(1,2,3,4,5))

    User("aNyein",10)

    val p1 = Person("Nyein")

    val p2 = Person("Chan",12)

    val p3 = Person("Aung",20,"POL")
}

class User(var name: String,var age: Int){
    // constructor
    init {
        if(name.lowercase().startsWith("a")){
            // this is self assignment , no need to write
//            this.name = name
        }else{
            this.name = "user"
        }
        println("Name: $name,age: $age")
    }
}

class Person(var name:String,var age:Int,var address:String){
    init {
        println("$name $age $address **")
    }

    constructor(name: String): this(name,1,"unknown"){
        println("$name $age $address")
    }

    constructor(name: String,age: Int): this(name,age,"Unknown"){
        println("$name $age $address")
    }
}