fun main(args:Array<String>){
    val user = User("Abhijeet","Mahoto",23)

    println("The Name of the User is : ${user.name}\n")


    val user2 = User("Shubham","Tiwari",22)

    println("The Name of the user is : ${user2.name}\n")
}

class User(name:String,var lastName:String,var age:Int){
    var name : String

    init{                                               //The code inside the init block is the first to be executed when the class is instantiated.
                                                        // The init block is run every time the class is instantiated, with any kind of constructor as we shall see next.
                                                       //Multiple initializer blocks can be written in a class. They'll be executed sequentially.
        if(name.lowercase().startsWith('a')){
            this.name = name
        }

        else{
            this.name = "User"
            println("The User name does'nt start with 'a' or 'A")
        }
    }
}