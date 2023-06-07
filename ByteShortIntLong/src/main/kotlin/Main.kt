fun main() {
    var name : String = "Shubham"
    var age : Int = 22

    val maxIntegerValue : Int = Int.MAX_VALUE

    val minIntValue : Int = Int.MIN_VALUE

    println("MaxIntegerValue is : $maxIntegerValue and MinIntValue is : $minIntValue")

    /*var number : Int = 2147483648*/ //This will show error because it is outside the integer value range

    var maxByteValue : Byte = Byte.MAX_VALUE
    var minByteValue : Byte = Byte.MIN_VALUE

    println("Max Byte Value is : $maxByteValue")
    println("Min Byte Value is : $minByteValue")

    val myNumber = 23L  // It is a Long Data Type

    val myNum2 = 28888888888 // It is also a Long Data Type

}