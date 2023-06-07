fun main(args:Array<String>) {
    val totalSum = getTotal(1,3,54,6,8,9,19,22,29,93,134)

    println("The Total Sum is : $totalSum")
}

fun getTotal(vararg numbers:Int) : Long{
    var Total : Long = 0

    for(number in numbers) {
        Total +=number
    }

    return Total
}