fun main(){

    var flag = 3

    flag = 7

    when(flag){

        in 1..5 -> {println("It is between 1 to 5") }   //It goes through this and then terminates

        3 -> {
                println("It is 3 ")
                flag++

                println("Check for the next statement that is printed")
        }

//        4 -> {
//            println("It is 4 now")
//            flag++
//        }
//
//        7 -> println("It is 7")

        4,7 -> println("It is either 4 or 7")

        else -> println("It is something different")
    }


    var choice = 3

    var result = when(choice){
        in 1..5 -> { "In between 1 to 5"}

        7,9 -> {"This is either 7 or 9"}

        else -> {"This something different number"}
    }

    println("The value of flag is now : $flag")


    println("The Result of the second control flow is : $result")
}