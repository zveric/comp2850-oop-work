/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

 // interface requiring implementing classes to have two fields
 // the second field has a get method, with default return value
 interface InterfaceProperties {
    val a : Int
    val b : String
        get() = "Hello"
}

// first implementation only provide default value for a
class PropertiesDemo0 : InterfaceProperties {
    override val a : Int = 50
}

// second implementation provide default values for a and b
class PropertiesDemo1 : InterfaceProperties {
    override val a : Int = 5000
    override val b : String = "Property Overridden"
}

fun main()
{
    val x = PropertiesDemo0()
    println(x.a)
    println(x.b)

    val y = PropertiesDemo1()
    println(y.a)
    println(y.b)
}
