fun main(args: Array<String>) {
    val numbers = mutableListOf("one","two","three","four")

    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four").toSet()     //It is converted to set to improve performance . It can work fine without toSet

    println(plusList)
    println(minusList)
}