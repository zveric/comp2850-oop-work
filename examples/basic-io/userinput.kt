/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

fun main() {
    println("Enter integer: ")

    // readLine() returns String? so can be null in which case ?: substitutes ""
    val userIn: String = readLine() ?: ""
    println("You typed: $userIn")

    // a complicated way of paring string to int with a default in case of error
    var flag = true
    val myInt :Int = try{
        userIn.toInt()
    }catch(e: NumberFormatException){
        flag=false
        println("$userIn is not an integer")
        // try clause must return an integer OR myInt must have type Any
        0
    }

    if(flag)
        println("Parsed number was $myInt")
}
