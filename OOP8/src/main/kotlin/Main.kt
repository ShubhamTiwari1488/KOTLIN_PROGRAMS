//Lazy Initialization Method (It is basically a common practice in which we put off creating and initializing an object untill it is actually needed)

fun main(args: Array<String>) {
   val user1 = User("Alex","Dobbin",23)
   val user2 = User("Salina","Gomez",25)

    val user3 by lazy{
        User("User1","lastName",0)
    }

    println("\nDisplaying the instance user3\n")
    
    println(user3.firstName)    //Now user2 instance is created and it is output
    println(user3.lastName)
    println(user3.age)
}

class User(var firstName:String,var lastName:String,var age:Int){
    init{
        println("User : $firstName was created")
    }
}