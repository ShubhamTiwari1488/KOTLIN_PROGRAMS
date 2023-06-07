//Demonstration of inheritance

fun main(){
    val view = View()

    val button = Button("Login","Center")

    val roundButton = RoundButton("Sing Up","Center",30)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View() {
    open fun draw(){        //Inorder to override the method , open keyword is needed to be used
        println("Drawing the view")
    }
}

open class Button(val text : String , val orientation : String) : View() {

    override fun draw() {

        // here is the code for creating the button
        println("Drawing the button")

        super.draw()
    }
}

class RoundButton(text:String , orientation : String , val coordinates : Int) : Button(text,orientation) {
    override fun draw() {
        println("Drawing the round button")

        super.draw()
    }
}