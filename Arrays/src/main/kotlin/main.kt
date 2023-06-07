fun main(){
    val names : Array<String> = arrayOf("Shubham","Mohan","Rohit")

    // val names = arrayOf("Shubham","Mohan","Rohit")

    println("First element : ${names[0]}")

    names[0] = "Bhagwati"

    //println("First element : ${names[4]}")    This is out of index


    println("The Size of the array is : ${names.size} \n")


    for ( name : String in names) {
        println(name)
    }



    val mixedElements = arrayOf(1,2,3,9,"Shubham",'A','Y',"z")

    println("\n Characters are : -  ")

    for ( i in mixedElements) {
        if( i is Char) {

        println(i)
        }
    }

    println("String are : - ")
    
    for(i in mixedElements) {
        if( i is String) {
            println(i)
        }
    }


    println("\nDisplaying the Array is : - ")

    mixedElements.forEach{
        println(it)
    }

    print("Printing the names : - ")

    names.forEach{
        print("$it ")
    }
}