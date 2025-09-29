/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

 import kotlin.system.measureNanoTime


fun main() {
    var sqrt = 0
    val number = 1000

    // fun measureNanoTime(block: () -> Unit): Long
    // a higher order function that takes a code block as its parameter
    val timeInNanos = measureNanoTime {
        while (sqrt * sqrt < number) sqrt++
    }

    println("(The operation took $timeInNanos ns)")
    println("The approximate square root of $number is between ${sqrt - 1} and $sqrt")
}
