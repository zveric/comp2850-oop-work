
fun main() {
    println(
        """PIZZA MENU 
        (a) Margherita
        (b) Quattro Stagioni
        (c) Seafood 
        (d) Hawaiian""".trimMargin()
    )

    println("Enter your choice: ")

    var choice = readLine()

    if (choice?.length == 1) {
        var charChoice = choice[0]

        if (charChoice in ('a'..'d')) {
            println("Order Accepted")
        }
    }
}