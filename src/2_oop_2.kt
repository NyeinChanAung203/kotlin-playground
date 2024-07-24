fun main(){
   var e1 = Employee("Nyein","Chan")
    e1.firstName = "Aung"
   println(e1.firstName)
}


// no var or val in constructor () for firstName cuz getter/setter
class Employee(firstName: String, var lastName:String){
    lateinit var phoneNumber: String

    var firstName: String = firstName
        get() {
            println("Get by getter")
            return field
        }
        set(value) {
            println("set \"$value\" by setter")
            field = if (field.isEmpty()){
                "Mr"
            }else{
                value
            }
        }
    /// if we use "firstName" instead of "field"
    /// it will call setter recursively -> throw an error
}

