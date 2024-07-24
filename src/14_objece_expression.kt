fun main(){
//    val clickListener = ClickListener()
//    val loginButton = Button("Login",1,clickListener)

                                                // this is called object expression
    val loginButton = Button("Login",1,object : OnClickListener{
        override fun onClick() {
            println("Login button is clicked")
        }
    })
    val signUpButton = Button("Sign UP",1,object : OnClickListener{
        override fun onClick() {
            println("signup button is clicked")
        }
    })


}

class Button(val text:String,val id:Int,onClickListener: OnClickListener)

//class ClickListener : OnClickListener{
//    override fun onClick() {
//        println("on click")
//    }
//
//}

interface OnClickListener{
    fun onClick()
}