# Task 10.3.2

`Check2.kt` won't currently compile, because it is passing a `String?`
object to a function that expects a `String` object.

1. Edit the file and change the parameter type in `printReversed()` to
   `String?`.

2. Add code that performs the null check to the body of the function.
   You should end up with a function like this:

   ```kotlin
   fun printReversed(text: String?) {
       when (text) {
           null -> println("Result: null")
           else -> println("Result: ${text.reversed().uppercase()}")
       }
   }
   ```

3. Compile the program. It should now compile successfully.

4. Run the program and experiment with providing different inputs. Try
   pressing `Ctrl+D` when prompted.
