fun main(args: Array<String>) {
    val car = Car("Maruti","White")
    val truck = Truck("TATA","Grey")
    val plane = Plane("Boeing","White")

    car.startEngine()
    truck.startEngine()
    plane.startEngine()
}

interface Engine {
    fun startEngine()
}

class Car(val name:String , val color:String) : Engine {
    override fun startEngine() {
        println("The car is starting the engine")
    }
}

class Truck(val name:String, val color:String) : Engine {
    override fun startEngine() {
        println("The Truck is starting the engine")
    }
}

class Plane(val name: String,val color: String) : Engine{
    override fun startEngine() {
        println("The plane is starting the engine")
    }
}


class Tesla(val name:String,val color:String) : Engine {
    override fun startEngine(){
        println("The Tesla is starting the engine")
    }
}