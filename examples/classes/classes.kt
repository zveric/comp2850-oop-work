/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */
import kotlin.math.sqrt

// class with one required paramert
class Atom(val atomicNumber: UInt){

    // since not assigned in base constructor these must be var
    var x: Double=0.0
    var y: Double=0.0
    var z: Double=0.0

    init{
        // init blocks used to test data or set-up stuff
        require(atomicNumber<93u) { "Transuranics not allowed" }
    }

    /* secondary constructor uses this for the base parameter then handles the other parameters
       first the base constructor is run then this constructor runs on an instantiated object
    */
    constructor(atomicNumber: UInt, x_: Double, y_: Double, z_: Double=0.0): this(atomicNumber){
        x = x_
        y = y_
        z = z_
    }

    // override the default toString method
    override fun toString() = "<Atom: $atomicNumber at [$x, $y, $z]>"

    // make a property a method that appears as a variable field
    val position: Array<Double> get()= arrayOf(x, y, z)

    // make a method
    fun distanceFrom(coord_x: Double, coord_y: Double, coord_z: Double): Double{
        val tmp_x = coord_x - x
        val tmp_y = coord_y - y
        val tmp_z = coord_z - z

        return sqrt(tmp_x+tmp_y+tmp_z)
    }
}

fun main() {
    try {
        // declare an atom with default z
        val a = Atom(91u, 13.4, -23.7)
        println(a)
        println(a.position)
        println(a.distanceFrom(1.2, 13.4, 234.5))
    }catch(e: IllegalArgumentException){
        println(e)
    }
}
