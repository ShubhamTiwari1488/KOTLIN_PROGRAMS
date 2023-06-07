fun main(){
    val isActive= false

    if(isActive)
    {
        println("It is Active")
    }

    else
    {
        println("It is not active")
    }


    val myNum = 150

    if(myNum > 100)
    {
        println("A")
    }

    else if(myNum > 20)
    {
        println("B")
    }

    else
    {
        println("No")
    }




    //Something different from java

    val text = if (true){
        println("This is true")
        "This is text 1"
    }

    else{
        println("This false")
        "This is text 2"
    }

    println("$text")

    val a = 9

    println(a)


    val stat = if(true)
        "It is stat 1"
    else
        "It is stat 2"

    println(stat)
}