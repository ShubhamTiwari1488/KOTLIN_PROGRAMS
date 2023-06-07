//Demonstration of for Loop

fun main(){

    for(i in 1..10){
        println("i is : $i")
    }

    println()

    //Second Way of writing it
    for(i in 1 until 10) {
        println("i is : $i")
    }

    println()

    //Third Way of writing it
    for(i in 10 downTo 1){
        println("i is : $i")
    }

    println()

    
    //Fourth Way of Writing it
    for(i in 1 until 10 step 2){
        println("i is : $i")
    }
}