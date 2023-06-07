//fun main(args: Array<String>) {
//    print("Enter text : ")
//
//    //val stringInput = readLine()  //One Way
//
//    val stringInput = readlnOrNull()    //Second Way
//
//    println("\nYou entered : $stringInput")
//}

import java.util.Scanner
import javax.xml.stream.events.Characters

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Enter a String: ")

    // nextInt() reads the next integer from the keyboard
    var string : String = reader.nextLine()

    print("\nEnter a number : ")
    var integer : Int = reader.nextInt()

    println("\nYou entered : $integer")
    println("\nYou entered : $string")
}