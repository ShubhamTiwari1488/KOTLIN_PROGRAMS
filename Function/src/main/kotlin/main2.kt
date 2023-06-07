//The concept of function overloading is similar to c++ or Java
// I am not showcasing that here

//This is just the demonstration of function with return type

fun main() {
    var max = getMax(2,5)

    var min = getMin(2,5)

    println("The Max Value obtained is : $max and Min value obtained is : $min")

    println("The getVal is : ${getVal(5)}")
}

fun getVal(a:Int):Int = if(true) a else -1

fun sayHello(text:String){
    println("Hello")
    return

    println("This will not be printed") //Below return no statement will be printed
}

fun getMax(a:Int,b:Int) : Int{

    var maxi = if(a>b) a else b

    return maxi
}

fun getMin(a:Int,b:Int):Int{
    val mini = if(a<b)a else b

    return mini
}