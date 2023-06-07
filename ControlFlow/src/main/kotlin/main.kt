fun main() {

//    var alarm = 7

//    when(alarm){
//        12 -> println("The value of the alarm1 is : $alarm")
//
//        7 -> println("The value of the alarm2 is : $alarm")
//
//        else -> println("The value of the alarm3 is : $alarm")
//    }





//    var alarm = 9

//    when(alarm) {
//        12,7,10 -> println("The value of the alarm1 is : $alarm")
//
//        else -> println("The value of the alarm is : $alarm")
//    }




//    var alarm = 18
//
//    when (alarm) {
//        12, 14 -> println("The alarm1 value is : $alarm")
//
//        in 1..10 -> println("The Value is in the range of 1 to 10")
//
//        else -> println("The value of alarm3 is : $alarm")
//    }






//    var alarm = 12
//
//    alarm = 4
//
//    alarm = 98
//
//    var text = when (alarm) {
//        12, 14 -> {
//            "This value is either 12 or 14"
//        }
//
//        in 2..5 -> {
//            "This value in the range of 2 to 5"
//        }
//
//        else -> {
//            "The alarm value is : $alarm"
//        }
//    }
//
//    println(text)




    var alarm = 8

    var text = when {

        alarm == 8 || alarm == 7 -> {"The alarm is either 8 or 7"}

        alarm >= 10 -> {"The alarm value is greater than 10"}

        else -> {"The alarm value is different"}
    }

    println(text)

}