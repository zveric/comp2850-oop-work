/**
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */

// to allow other classes ot inherit a class must be declared open
// name are age are
open class Person(val name: String, var age: UInt){

    // replace the default toString method
    override fun toString(): String{
        return "<Person: $name, $age>"
    }
}

// inherit from Person
// note no var/val on name or age, they are parameters only passed to Person
class Custormer(name: String, age: UInt, var balance: Float): Person(name, age){

    // need a new toString
    override fun toString(): String{
        return "<Customer: $name, $age, $balance>"
    }
}

// the parameter is a Person
// this funcion knows nothing about Customer
fun printPerson(person: Person){

    // despite being a Person object the 'top' toString method is called
    println(person.toString())
}

fun main(args: Array<String>) {
    val someone = Person("Sally", 23u)
    printPerson(someone)

    val someoneElse = Custormer("Tim", 17u, -17.25f)
    printPerson(someoneElse)
}
