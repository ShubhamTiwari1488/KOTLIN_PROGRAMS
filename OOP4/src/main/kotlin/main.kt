//Default Parameters
fun main(){
    val user = User("Shubham")

    user.display()

    println("\n")

    val maa = User(age=50,name="Pratima")

    maa.display()

}

class User(var name:String,var lastName:String = "Tiwari",var age:Int = 22){

    fun display(){
        println("Name is : $name $lastName\n")
        println("Age is : $age\n")
    }
}