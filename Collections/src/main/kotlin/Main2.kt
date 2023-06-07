fun main()
{
    val user1 = User("user1")
    val user2 = User("Shubham")
    val user3 = User("Anshu")
    val user4 = User("Shubham")

    val names = mutableSetOf<User>(user1,user2,user3,user4)

    names.forEach{
        println(it.name)
    }
}

//class User(val name:String)         //Use data keyword or else set will not be to distinguish distinct character......will result in printing duplicates


data class User(val name:String)