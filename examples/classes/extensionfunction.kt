/**
Extension Functions are a means of adding new functionality to existing classes
without using inheritance. Instead we add an extension which can be used as if
it was part of the original API.

Typically, extensions are written in their own files, and many applications are implemented
as extensions to a set of classes provided by the framework.
School of Computer Science, University of Leeds, Leeds, UK
 */
import kotlin.math.sqrt
import kotlin.math.PI

// class with parameter radius
class Circle(val radius: Double){

    init{
        // init blocks used to test data or set-up stuff
        require(radius>0.0) { "Radius must be positive" }
    }

    // override the default toString method
    override fun toString() = "<Circle: radius $radius>"

    // area
    fun area(): Double{
        return PI*radius*radius
    }
}

// extension function added to Circle
// to make ellipse assume the radius is now the semi-minor (short) axis and find the semi-majour (long) axis
// excentricity = sqrt(1-(semi-majour^2/semi-minor^2))
fun Circle.find_semi_major_axis(eccentricity: Double):Double{
    require(1.0>=eccentricity && 0.0<=eccentricity){"eccentricity must be in range [0.0, 1.0], was $eccentricity"}

    return sqrt(radius*radius*(1.0-eccentricity*eccentricity))
}

// extension function added to string
fun String.make_html_pragraph(): String{
    return "<p> $this <p>"
}

fun main() {
    try {
        val a = Circle(7.8)
        println("$a area ${a.area()}")
        println("semi-majour ${a.find_semi_major_axis(-1.0)}")
    }catch(e: IllegalArgumentException){
        println(e)
    }

    val s = "hello dolly"
    println(s.make_html_pragraph())
}