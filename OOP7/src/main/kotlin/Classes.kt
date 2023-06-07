//Again single instance creation

fun main(){
    println(Database)
    println(Database)
    println(Database)
    println(Database)
    println(Database)
}

object Database{
    init{
        println("Database Created")
    }
}