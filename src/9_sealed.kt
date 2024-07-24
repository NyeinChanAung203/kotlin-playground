fun main(){
    val error = Error("error is occured")
    getData(error)
}

fun getData(result: Result){
    when(result){
        is Success -> result.showMessage()
        is Error -> result.showMessage()
        is Loading -> result.showMessage()
    }
}

sealed class Result(val message:String){
    fun showMessage(){
        println("Result: $message")
    }
}
class Success(message: String):Result(message)
class Error(message: String):Result(message)
class Loading(message: String):Result(message)