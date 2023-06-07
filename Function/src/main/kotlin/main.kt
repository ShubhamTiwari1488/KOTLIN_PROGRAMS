fun main() {
    sayHello()
    sayHello()
    sayHello()
    sayHello()


    sayName("Shubham")
    sayName("Dadu")
    sayName("Anshu")


    nameAge("Shubham",23)
    nameAge("Anshu",10)
}

fun sayHello(){
    println("Hello")
}

fun sayName(name : String) {
    println("Your Name is : $name")
}

fun nameAge(name:String,age:Int){

    //var age = 0  This will make the below statement always ZERO.

    var age = age + 5

    println("Hello,$name. Age:$age")
}