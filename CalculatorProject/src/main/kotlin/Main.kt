//Companion Object

fun main(args: Array<String>) {
//    val calculator = Calculator()
//
//    val result : Int = calculator.sum(5,9)
//
//    println(result)

    val result = Calculator.sum(5,10)

    println(result)

    println("The Max is : ${Calculator.max}")


    val result2 = Calculator()

    println(result2.sum(3,3))
}

//class Calculator(){
//    fun sum(a:Int,b:Int):Int{
//        return a+b
//    }
//}

class Calculator(){
    companion object Summation{
        var max = 100
        fun sum(a:Int,b:Int) : Int{
            return a+b
        }
    }

    fun sum(a:Int,b:Int) : Int{
        println("The sum : ")

        return 7
    }
}