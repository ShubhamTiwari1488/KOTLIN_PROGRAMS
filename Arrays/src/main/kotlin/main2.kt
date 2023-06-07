fun main() {

    val max : Int = findMax(arrayOf(4,6,7,4,3,6))

    val min : Int = findMin(arrayOf(4,7,9,20,7,100))

    println("Max value  = $max")
    println("Min value = $min")
}

fun findMax(numbers : Array<Int>) : Int {
    var max = numbers[0]

    for(num in numbers){
        if(max<num){
            max = num
        }
    }

    return max
}

fun findMin(numbers : Array<Int>) : Int
{
    var min = numbers[0]

    for(num in numbers){
        if(min>num){
            min = num
        }
    }

    return min
}

