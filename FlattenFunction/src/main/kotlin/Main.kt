fun main(args: Array<String>) {

    //Flatten
    //val numberSets = listOf(setOf(1,2,3) , setOf(4,5,6) , setOf(7,8,9)) //It is basically a 2D array


//    val numberSets = arrayOf(arrayOf(1,2,3) , arrayOf(4,5,6) , arrayOf(7,8,9)) //It is basically a 2D array
//
//    println(numberSets[2][2]) //Show an error using listOf. So use arrayOf

    val numberSets = listOf(setOf(1,2,3) , setOf(4,5,6) , setOf(7,8,9))

    println("Displaying the 2D Array: \n")

    for(numbers in numberSets) {
        for(number in numbers) {
            println(number)
        }
    }

    println("\n")
    //converting the 2D array using flatten

    val numberFlatten = numberSets.flatten()

    println(numberFlatten[8])

    println("\n")

    for(number in numberFlatten){
        println(number)
    }
}