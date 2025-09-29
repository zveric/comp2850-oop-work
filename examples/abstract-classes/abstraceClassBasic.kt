/*
School of Computer Science, University of Leeds, Leeds, UK
Sept 2025
 */
 
// base is person with name and number
abstract class Person(val name: String, val idNumber: UInt) {

    init {
        // this is just to show an oject was made
        println("Made Person $name, $idNumber.")
    }

    // all subclass objects will have this
    fun printGreeting(greeting: String){
        println("$greeting $name")
    }

    // all non-abstract subclass objects will provide this
    abstract fun printRole()
}

// a non-abstract sub-class of Person
class Teacher(name: String, idNumber: UInt): Person(name, idNumber) {

    // non-abstract so must implement the abstract method
    override fun printRole() {
        println("$name is a Teacher")
    }
}

fun main(args: Array<String>) {
    val temp = Teacher("Alice Brown", 1234.toUInt())
    temp.printGreeting("Hello")
    temp.printRole()
}
