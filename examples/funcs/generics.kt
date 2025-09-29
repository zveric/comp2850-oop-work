/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */
 import java.util.Arrays

// the des
fun copy(from: Array<out Any>, to: Array<Any?>) {
    require(from.size == to.size){"in and out arrays must be same size"}

    for (i in from.indices)
        to[i] = from[i]
}

fun main() {
    val source = arrayOf(1, 3, 5, 8)

    // change the size to trigger the require function
    var destination: Array<Any?> = arrayOfNulls(4)

    println("source: " + Arrays.toString(source))
    println("destination: " + Arrays.toString(destination))

    // source can be Int but destintion must be Any?
    copy(source, destination)

    println("destination: " + Arrays.toString(destination))
}
