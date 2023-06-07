fun main(args: Array<String>) {
    val names1 = listOf<String>("Name 1","Name 2","Name 3")  //Immutable list

    println(names1[0])

    println("\n")

    val names = mutableListOf("Name 1","Name 2","Name 3","Name 4")  //Mutable List

    names.add("Name 5") //Add elements

    names.removeAt(0)   //Remove At Index '0'

    names.remove("Name 3")  //Remove by element name

    names.forEach{
        println(it)
    }


    //Mutable List can have duplicates but sets dont have duplicates

    println("\n")

    val names3 = setOf("Name 1","Name 2","Name 3","Name 1")

    names3.forEach{
        println(it)
    }

    println("\n")

    val names4 = mutableSetOf("Name 1","Name 2","Name 3","Name 1")

    names4.add("Name 5")

    names4.forEach{
        println(it)
    }

}