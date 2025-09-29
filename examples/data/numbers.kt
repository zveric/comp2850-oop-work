/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

fun main() {
    // Kotlin Int can never be assigned to null
    var a: Int = 32

    // Kotlin Int the ? means it can be assigned to null
    var b: Int? = null

    // old Java Integer should give compiler warning only use for Java compatability
    var c: Integer = Integer(7)

    // unsigned short int, must have u on end else Kotlinc will make Int then fail on type error
    var d: UShort = 56u

    // all types are objects and have built in conversion methods
    var e: Long = d.toLong()

    println("$a and $b and $c and $d and $e")
}
