/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// basic enumeration of compass heading
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// enum with a class value and a function, in this case getting the next
enum class Color(val rgb: Int) {
    RED(0xFF0000){
        override fun nextColor() = GREEN
    },

    GREEN(0x00FF00){
        override fun nextColor() = BLUE
    },

    BLUE(0x0000FF){
        override fun nextColor() = RED
    }; // don't miss the semi-colon

    abstract fun nextColor(): Color
}

fun demoSimple(){
    // make enum object
    val path = Direction.NORTH

    // alternative way of making object
    val other = Direction.valueOf("SOUTH")

    // the objects automatically have hashCode method
    println("${path.name} hash ${path.hashCode()}")
    println("${other.name} hash ${other.hashCode()}")

    println("\n")
}

fun demoInstanceVars(){
    val red = Color.RED

    // iterate the enumeration
    for (item in Color.entries){
        println("${item.name} value ${item.rgb} next is ${item.nextColor()}")
    }
}

fun main() {
   demoSimple()
   demoInstanceVars()
}
