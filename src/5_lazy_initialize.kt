class Teacher(var name:String,var subject:String) {
    init {
        println("Teacher $name was created")
    }
}


fun main(){
    var t1 = Teacher("Hsu","Japan")
    println(t1)
    val t2 by lazy {
        Teacher("Htoo","Korea")
        Teacher("Htoo1","Korea1")
    }
    // when we use t2 , teacher will initialize
    println(t2)
}