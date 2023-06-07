//Calling the primary constructor from secondary constructor

fun main(){
    val clg = University("KIIT","Bhubaneswar","Engineering")

    clg.display()

    println("\n")

    val med = University("KIMS")

    med.display()
}

class University(var name:String, var desc:String, var addr:String){

    constructor(name:String):this(name,"MEDICAL","Odissa") //Primary Constructor is Called
    {
        println("This is 2nd")
    }

    constructor(name:String,desc:String):this(name,desc,"Jamshedpur")

    fun display(){
        println("The University Name is : ${name}")
        println("The University Desc is : ${desc}")
        println("The University addr is : ${addr}")
    }
}