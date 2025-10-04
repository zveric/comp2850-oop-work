fun main() {
    println("What value do you want to reach?")

    val targetValue = readLine()!!.toInt()

    for (n in 1..targetValue step 2) {
        println(n)
    }
}