/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// demonstrate while loop
// the loop is pretested and runs until a condition is satisfied
fun demoWhile(){
    var a = 5
    var b = 0
    println("Pretested")

    // pretested loop
    while (a > b) {
        println("Test before run loop: $a > $b")
        b += 1
    }
}

// demonstrate do-while loop
// the loop is posttested and runs until a condition is satisfied
fun demoDoWhile(){
    var a = 5
    var b = 5
    println("Posttested")

    // posttested loop
    do {
        println("Test after run loop: $a > $b")
        b += 1
    }while(a>b)
}

// demonstrate for loop on container
// the loop runs through all the objects in a container.
fun demoFor1() {
    var myArray = arrayOf("red", "magenta", "blue", "green")

    for (i in myArray.indices) {
        val tmp = myArray[i]
        println("value $i = $tmp")
        // the $ operator references a variable what
        // happens if you replace the above with
        // println("value $i = $myArray[i]")
    }
}

// demonstrate for number of times loop
// the loop runs through a range of numbers
fun demoFor2() {
    for (i in 1..5) {
        println("$i")
    }
    println()
    for (i in 1..<5) {
        println("$i")
    }

    // the repeat key word can also be used
    repeat(5){
        println("repeating")
    }
}

// the if / if else / else construct found in most languages
fun demoIf(a: Int, b: Int) {
    if (a < b){
        println("$a < $b")
    }else if (b < a) {
        println("$b < $a")
    }else {
        println("$b = $a")
    }

    // when you return a value there must be else
    val max: Int = if (a < b){
        b
    }else if (b < a) {
        a
    }else {
        a
    }
}

// when is a more compact version of if
fun demoWhen(a: Int) {
    // do something based on choice
    when (a) {
        7 -> println("is seven")
        8 -> println("is eight")
        else -> println("other")
    }

    // when can also return a value
    var text = when (a) {
        7 -> "is seven"
        8 -> "is eight"
        else -> "other"
    }

    println(text)

    var x = 100
    var y = 20

    // when can be written without a subject
    // the first true condition is taken so be careful about overlapping conditions
    text = when {
        x < y -> "y is larger"
        x > y -> "x is larger"
        else -> "equal"
    }
    println(text)
}

// the function the JVM will call to start,
fun main() {
    demoWhile()

    println() // print empty line
    demoDoWhile()

    println()
    demoFor1()

    println()
    demoFor2()

    println()
    demoIf(5, 7)

    println()
    demoWhen(7)
}
