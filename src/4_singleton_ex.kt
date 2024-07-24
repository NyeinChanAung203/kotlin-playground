// first way
class Database private constructor(){
    companion object{
        private var  instance: Database = Database()

        fun instance(): Database = instance
    }
}

// second way
object FireStore{
    init {
        println("firestore is initializing")
    }
}

fun main(){
    val db1 = Database.instance()
    val db2 = Database.instance()

    println("$db1 $db2")

    println(FireStore)
    println(FireStore)
}