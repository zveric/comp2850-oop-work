/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

 // Imports Java Scanner
import java.util.Scanner

fun main() {
    // Initializes the Scanner
    val scanner = Scanner(System.`in`)

    print("Enter something: ")
    val line = scanner.nextLine() // Reads a whole string line
    println("You typed: $line")

    print("Enter something without a whitespace: ")
    val string = scanner.next()
    println("You typed: $string")

    // Reads a number. For example: 123
    print("Type an int: ")
    val num = scanner.nextInt()
    println("Your number was: $num")
}
