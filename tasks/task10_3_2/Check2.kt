// Task 10.3.2: another example of an explicit null check

fun printReversed(text: String) {   // modify parameter list

    // modify function body to perform a null check

    val result = text.reversed().uppercase()
    println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
