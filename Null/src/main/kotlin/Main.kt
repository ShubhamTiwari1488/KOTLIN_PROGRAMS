fun main(args: Array<String>) {

//    var text : String? = "Shubham"  //'?' is the safe call operator
//
//    text = null
//
//    if(text != null){
//        println("The length of the text is : ${text.length}")
//    }
//
//    else{
//        println("The variable is NULL")
//    }
//
//    var str : String? = "Name"
//
//    str = null
//
//    println(str?.length)


    var text : String? = null

    text = "This variable is not null"

    val text2 : String = text ?: "The variable is null."

    println(text2)
}