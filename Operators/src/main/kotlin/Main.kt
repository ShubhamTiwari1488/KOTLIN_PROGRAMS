fun main(args: Array<String>) {
    var x = 5
    var y = 9.0

    println("The result is : ${x+y})")
    println("The result is : ${x-y})")
    println("The result is : ${x*y})")
    println("The result is : ${x/y})")
    println("The result is : ${x%y})")

    var result = x+y
    result +=2
    result -=9
    result *=2

    println("Now the result is : $result")

    x = 0

    println("Incremental of x is : ${x++}")
    println("Decremental of x is : ${x--}")
    println("Now the value of x is : ${--x}")

    println("Now the value of x is : ${++x}")
}