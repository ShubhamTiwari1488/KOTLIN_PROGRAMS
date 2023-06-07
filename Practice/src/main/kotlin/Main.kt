
fun main()
{
    val car = Car("HONDa","red",4)

    car.move()
    car.stop()

}

abstract class Vehicle() {

    abstract fun move()

    abstract fun stop()
}

class Car(var name : String , var color : String , val engine : Int) : Vehicle()
{
    override fun move() {
        print("A")
    }

    override fun stop() = print("B")
}