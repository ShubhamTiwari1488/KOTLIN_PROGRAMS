//Lambda Functions

//Map Transformation

fun main(args: Array<String>) {
    val numbers = setOf(1,2,3,4,5)

    println(numbers.map {it * 10})  //Multiply each numbers by 10

    println("\n")

    println("Printing Map")
    println(numbers.map { if (it == 3) it*100 else it*10})

    println("\nPrinting mapIndexedNotNull")
    println(numbers.mapIndexedNotNull { index ,value -> if(index == 0) null else index*value})

    val numbersMap = mapOf("Key 1" to 1,"Key 2" to 2,"Key 3" to 3)

    println("\n")
    
    println(numbersMap.mapKeys { it.key.uppercase()})

    println("\n")

    println(numbersMap.mapValues { it.value + it.key.length})



    //Zipping
    val colors = listOf("red","brown","grey")
    val animals = listOf("fox","bear","wolf")

    println(colors.zip(animals));   //Pairs are created for the above two list

    print("\n")

    //Writing in a more formatted way
    println(colors.zip(animals){color,animal -> "The ${animal.replaceFirstChar {it.uppercase()}} is $color"})

    val numberPairs = listOf("one" to 1,"two" to 2,"three" to 3,"four" to 4)

    println("\nPrinting the pairs : ${numberPairs}")

    println("\nUnzipping the pairs : ${numberPairs.unzip()}")

}