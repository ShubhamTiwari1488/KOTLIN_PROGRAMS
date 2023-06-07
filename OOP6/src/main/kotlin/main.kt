//Demonstration of late init Keyword

fun main(args:Array<String>){
    val user = User("Shubham","Tiwari",23)

    user.favoriteMovie = "KGF"

    println(user.favoriteMovie)
}

class User(var firstName:String,var lastName :String,var age:Int){
    lateinit var favoriteMovie : String //Without the use of lateinit , it would have shown error

    //You can use lateinit only with classes and not with primitive type ...
    // such as lateinit var favoriteMovie:Int

    //lateinit var favoriteSport : User     !!This is correct!!
}