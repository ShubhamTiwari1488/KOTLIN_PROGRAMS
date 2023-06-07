fun main(args:Array<String>) {
    var car1 = Car()    //Instead of var we can use val ,since the variable is never modified

    car1.name = "TATA"
    car1.model = "SAFARI"
    car1.color = "White"
    //car1.doors = 4    Since the door is declared as val so , we can't change it.

    println("The Car Name is : ${car1.name}")
    println("The Car Name is : ${car1.model}")
    println("The Car Name is : ${car1.color}")
    println("The Car Name is : ${car1.doors}")

    car1.move()
    car1.stop()

    println("\nCreating another Object\n")

    val car2 = Car()

    car2.name = "Mahindra"
    car2.model = "SUMO"
    car2.color = "GREY"
    //car2.doors = 4        //Defined as val so it can't be modified

    println("The Car Name is : ${car2.name}")
    println("The Car Name is : ${car2.model}")
    println("The Car Name is : ${car2.color}")
    println("The Car Name is : ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    val doors = 4

    fun move() {
        println("The Car ${name} is moving")
    }

    fun stop() {
        println("The Car ${name} has stopped")
    }
}