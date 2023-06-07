fun main(args: Array<String>) {
//   println(Direction.WEST)
//   println(Direction.EAST)
//   println(Direction.NORTH)
//   println(Direction.SOUTH)

    for(direction : Direction in Direction.values()){
        println(direction)
    }

    println("\n")

    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)

    println("\n")

    val direction = Direction.EAST

    when(direction){
        Direction.EAST ->{
            println("The direction is EAST")
        }

        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }
}

//enum class Direction {
//    NORTH,
//    SOUTH,
//    EAST,
//    WEST
//}

enum class Direction(var direction:String,var distance:Int) {
    NORTH("north",10),
    SOUTH("south",20),
    EAST("east",15),
    WEST("west",40);    //Since down you are declaring a function so use semi colon here

    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }
}