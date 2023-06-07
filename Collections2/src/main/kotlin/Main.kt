fun main(args: Array<String>) {
    //val users = mapOf<Int,String>(1 to "Maria",2 to "Andrew",3 to "Beewer")

    val users = mutableMapOf<Int,String>(1 to "Maria",2 to "Andrew",3 to "Beewer")

    println(users[1])

    users[5] = "Vlad"   //Adding into the map

    users.remove(2) //Deleting the value

    println("\n")

    users.forEach{ t, u ->
        println("$t and $u")
    }
}