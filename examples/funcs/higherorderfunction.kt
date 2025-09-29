/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025

higher order functions are functions that take pointers to other functions as parameters
 */

// ordinary function multiplies a string
fun repeatFun(text: String, times: Int): String{
    // the function is just a wrapper for the String::repeat method
    return text.repeat(times)
}

// higher order function
// the second parameter is a function with parameters (String, Int) and returns String
fun runTransformation(inString: String, inFunction: (String, Int) -> String): String {
    return inFunction(inString, 3)
}

fun main(){
    // first use of higer order function with above function
    // to pass in function we use :: notation (reflection)
    val result1 = runTransformation("hello ", ::repeatFun)
    println(result1)

    ///////////////////////////////////////////

    // avoid the :: reflection assigning a lambda function to a variable
    // in lambda use <type>.(<type>) to get a method of String to use 'this'
    val repeatLambdaFun: String.(Int) -> String = { times -> this.repeat(times) }

    // second use of higher order function using lambda function
    val result2 = runTransformation("by ", repeatLambdaFun)
    println(result2)
}
