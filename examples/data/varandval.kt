/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

fun main() {
    // full declaration with type of a variable that can be changed
    var i: Int = 4

    // change the contents of the variable
    i = 7

    // a value cannot be reassigned.
    val my_constant = 12.3

    // if you uncomment the following it will fail to compile
    // my_constant = 76.3

    // val is good for containers as you can alter the contents but not the container
    val programmingLangs: MutableList<String> = mutableListOf("python", "c", "kotlin")

    // the following works as the value programmingLangs itself is not changed
    programmingLangs.add("sql")
    programmingLangs.remove("c")

    // the following will not compile as it replaces the value programmingLangs
    // programmingLangs = mutableListOf("rust", "c++", "fortran")

    println(programmingLangs[2])
}
