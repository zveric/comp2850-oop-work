/*
School of Computer Science, University of Leeds, Leeds, UK
 */

// very basic function
fun printResult(a: Int) {
    println("Final Result was $a")
}

// a bit more
fun addNumbers(a: Double, b: Double): Double {
    return a + b
}

// single experssion function can avoid the curly brackets
// this one reles on Kotlin returning a value from an if statment
fun maximum(a: Double, b: Double): Double = if (a>b) a else b

// change a parmeter without returning anything
fun augmentList(list: MutableList<Int>){
    list.add(8)
    list.add(10)
}

// the function the JVM will call to start,
fun main() {
    // full declaration with type
    var i: Int = 4

    // call function
    printResult(i)

    val n1 = 5.5
    var n2 = 6.5

    println("$n1 + $n2 = " + addNumbers(n1, n2) + ", max was " + maximum(n1, n2))

    val list = mutableListOf<Int>()

    augmentList(list)

    for (item in list) {
        println(item)
    }
}
