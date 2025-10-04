import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size <3) {
        println("Not enough arguments")
        exitProcess(1)

    }

    val totalGrade : Int = args[0].toInt() + args[1].toInt() + args[2].toInt()
    val averageGrade : Int = totalGrade / 3
    val grade = when (averageGrade) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }
    println("Grade: $grade")

}

