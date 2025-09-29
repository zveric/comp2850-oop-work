/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// global VARIABLE can be changed
var MY_GLOBAL_VAR: Int = 32

// global VALUE cannot be changed
val MY_GLOBAL_VAL: Int = 64

// string substituted for macro
const val MY_GLOBAL_MACRO = "This is substitued in by compiler wherever the macro occures"

// 3.1415 sustituted for macro
const val MY_GLOBAL_PI: Double = 3.1415

fun main() {
    MY_GLOBAL_VAR = 15

    println("$MY_GLOBAL_VAR, $MY_GLOBAL_VAL")
    println(MY_GLOBAL_MACRO)
    println(MY_GLOBAL_PI)
}