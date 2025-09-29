// Task 1.5

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldEndWith
import io.kotest.matchers.collections.shouldBeIn

@Suppress("unused")
class GreetTest : StringSpec({
    "Target included at the end of a greeting" {
        greetingFor("Joe") shouldEndWith "Joe!"
    }

    "Greeting begins in one of three possible ways" {
        val possibleStarts = setOf("Hello", "Hi", "G'day")
        repeat(15) {
            val start = greetingFor("Somebody").split(" ")[0]
            start shouldBeIn possibleStarts
        }
    }
})
