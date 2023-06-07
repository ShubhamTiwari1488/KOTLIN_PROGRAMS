fun main(args : Array<String>){
    val total = getSum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    println("The total is : $total")

    printNum(1,2,3,4,5,6,7,8,9,10)
}

fun getSum(vararg numbers : Int) : Int{
    var total  = 0

    for(number in numbers){
        total += number
    }

    return total
}

//Use of forEach Loop

fun printNum(vararg numbers :Int){
    numbers.forEach{ println(it)}
}