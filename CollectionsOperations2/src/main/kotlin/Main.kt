fun main(args: Array<String>) {
    val numbers = listOf("one","two","three","four")

    println(numbers.associateWith{it.length})
    println(numbers.associateWith{it.first().uppercase()})

    //Building the associate

    println(numbers.associateBy{ it.first().uppercase()})

    println("\n")
    println(numbers.associateBy(keySelector = { it.first().uppercase()} , valueTransform = {it.length}))

}