// Task 6.4.2: program that uses the anagram checking function

fun main() {
    print("Enter a word: ")
    val firstWord = readln()

    print("Enter another word: ")
    val secondWord = readln()

    if (secondWord anagramOf firstWord) {
        println("$secondWord is an anagram of $firstWord")
    }
    else {
        println("$secondWord is NOT an anagram of $firstWord")
    }
}
