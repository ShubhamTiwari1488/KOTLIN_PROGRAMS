//DataClasses

fun main(args: Array<String>) {
    val name1 = "Shubham"
    val name2 = "Shaswat Sahu"

    println(name1 == name2)  // '==' checks for values similarity

    println(name1 === name2)    // '===' checks for objects similarity


    val user1 = User("Alex","Dobbas",21)
    val user2 = User("Alex","Dobbas",21)


    println(user1 == user2)

    println(user1.equals(user2))
}

//Class Any is the superior class which is inherited by all classes by default

class User(var firstName : String, var lastName:String, var age : Int){
    override fun equals(other: Any?): Boolean {
        if(this === other) {
            return true
        }

        if(other is User) {     // The 'is' operator checks for the type of the variable and returns boolean as true if it is of same type.
            return  this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }

        return false
    }

    override fun hashCode() : Int {
        return 0;
    }

    override fun toString() : String {
        return "User(firstName = '$firstName' , lastName = '$lastName' , age = '$age'"
    }
}

//The Above code can be generated using : -

//data class People(var firstName:String,var lastName:String, var age:Int){
//}