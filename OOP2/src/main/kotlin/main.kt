//Classes With Public Constructors

fun main(){
    val car = Car(model="HYUNDAI",name="    HONDA   ",color="WHITE",door=4)

    car.move()
    car.stop()

    val person = Person("Shubham",22,"Male")

    person.sayHello()
    person.sayAge()
    person.sayGender()
}

class Car(name:String , model:String , color : String , door : Int)
{
    private val name = name.trim()      //Trim is used to remove the spaces
    private val model = model
    private val color = color
    private val door = door

    fun move(){
        println("The Car $name is moving\n")
    }

    fun stop(){
        println("The Car $name is stop\n")
    }
}

//Class with properties
class Person(private val name: String, private val age: Int, private val gender: String){

    fun sayHello(){
        println("My name is : $name")
    }

    fun sayAge(){
        println("My Age is : $age")
    }

    fun sayGender(){
        println("My Gender is : $gender")
    }
}

