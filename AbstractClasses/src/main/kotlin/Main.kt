//Demonstration of Abstract Classes

fun main(args: Array<String>) {

}

abstract class Vehicle() {


    abstract fun move()

    abstract fun stop()
}

class Car (var name:String,var color:String,val engines : Int,val doors:Int) : Vehicle() {

    override fun move() {

    }

    override fun stop() {

    }
}