//Here we are going to show about default parameter

fun main(){
    printMessage("Shubham","Namaste")

    printMessage("Anshu")

    printMessage()

    printMessage(message="Kemcho",name="Surya")

    printMessage("Alexandra",sendText())

}

fun printMessage(name: String = "User", message: String = "Hello"){
    println("Name is : $name and  Message is : $message")
}

//fun sendText():String {
//    return "Francis"
//}

//fun sendText():String = "Braxit"

fun sendText() = "Wadakam"