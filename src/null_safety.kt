fun main(){
    var text: String? = null
    println(text?.length)
    text = text ?: "if null use this text"
    println(text!!.length)

}