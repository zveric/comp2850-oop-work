/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// an (x, y) coordinate of a character in a game
data class Coordinate2D(val x: Double, val y: Double)

/*
a container for the state of a charcter in a game
level: the game level
section: the section
lastCoord: coordinates of character in section
heading: rotation of character, not always needed, so instance var with default zero.
 */
data class CharacterLocationStore(val level: UInt, val section: UInt, var lastCoord: Coordinate2D){
    // current direction
    var heading: Double = 0.0
}

// some properties of Coordinate2D objects
fun demoSimple(){
    println("Kotlin Data class demo")
    val coord0 = Coordinate2D(1.0, 1.0)
    val c0clone = Coordinate2D(1.0, 1.0)
    val coord1 = Coordinate2D(15.0, 2.3)

    // hash code povided for identifiction
    println("coord0 hash ${coord0.hashCode()}")
    println("c0clone hash ${c0clone.hashCode()}")
    println("coord1 hash ${coord1.hashCode()}")

    // == test on values
    if (coord0 == coord1){
        println("1. $coord0 equals $coord1")
    }else{
        println("1. $coord0 not equal $coord1")
    }

    // == test on values
    if (coord0 == c0clone){
        println("2. $coord0 == clone ")
    }else{
        println("2. $coord0 not == clone")
    }

    // === test on memory location
    if (coord0 === c0clone){
        println("3. $coord0 === clone ")
    }else{
        println("3. $coord0 not === clone")
    }
}

fun demoInstanceVars(){
    println("\nKotlin Data class demo")
    val location0 = CharacterLocationStore(1.toUInt(), 3.toUInt(), Coordinate2D(34.0, 78.0))
    val location1 = CharacterLocationStore(1.toUInt(), 3.toUInt(), Coordinate2D(34.0, 78.0))

    location1.heading = 2.789
    println("No instance vars in automatic toString so no heading $location1")

    if(location0 == location1){
        println("location1 == location0: instance var heading ignored in hashCode and equals based on hashcode")
    }

    // the non-instance vars can accessed unsing numbered accessor methods
    println("loc0 level ${location0.component1()}")
    println("loc0 section ${location0.component2()}")
    println("loc0 coord ${location0.component3()}")

    // will not comple no componentN() for instance vars
    //println("loc0 heading ${location0.component4()}")
}

fun main() {
   demoSimple()
   demoInstanceVars()
}
