/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// the function the JVM will call to start,
fun main() {
    // var means variable
    // full declaration with type
    var i: Int = 4

    // inferred type
    var j = 2

    // val this is constant same as 'const' in C
    // convert in string
    val message1: String = "i: $i, j: $j"

    // concatente to string
    val message2 = "I: int = " + i

    // println can only take one parameter.
    println(message1)
    println(message2)
    println("Variables $i and $j")
}
