import javax.lang.model.util.Elements

fun main(){
    val obj1 = Car("BMW")
    val obj2 = Car("BMW")
    val obj3 = Car("BMW")


    val obj4 = Bike("Hayabusa")
    val obj5 = Bike("Splender")

    val Elements = mutableSetOf<Any?>(obj1,obj2,obj3,obj4,obj5)

    Elements.forEach{
        println(it)
    }

    println("\n")

    println(obj1.equals(obj2))  // if data keyword used then gives true output else will display false (as per this code)
}

data class Car(val name:String)

data class Bike(val name:String)