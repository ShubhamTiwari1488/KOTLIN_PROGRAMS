fun main(args: Array<String>) {

    val loginButton = Button("Login",1232,object: OnClickListener {
        override fun onClick(){
            //Login the user
        }
    } )
}

class Button(val text : String , val id : Int, onClickListener : OnClickListener)

class ClickListener() : OnClickListener {
        override fun onClick() {

        }
}


interface OnClickListener {
    fun onClick()
}