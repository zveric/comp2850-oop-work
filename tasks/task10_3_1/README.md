# Task 10.3.1

`Check1.kt` won't currently compile, because it is passing a `String?`
object to a function that expects a `String` object.

1. Edit the file and replace the last line of `main()` with this code:

   ```kotlin
   when (input) {
       null -> println("Result: null")
       else -> printReversed(input)
   }
   ```

2. Compile the program. It should now compile successfully.

3. Run the program and experiment with providing different inputs. Try
   pressing `Ctrl+D` when prompted.
