fun greetingFor (target: String): String {
    val greeting = setOf("Hello","Hi","Howdy").random()
    return "$greeting $target!"
}
