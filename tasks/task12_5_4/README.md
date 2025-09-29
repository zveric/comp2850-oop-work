# Task 12.5.4

1. Edit `Age.kt`. Add the following import to the file:

   ```kotlin
   import java.time.temporal.ChronoUnit.YEARS
   ```

2. Add a computed property named `age` to the `Person` class:

   ```kotlin
   val age get() = YEARS.between(birth, LocalDate.now()).toInt()
   ```

   See the notes for an explanation of this code.

3. Add a `main()` function to `Age.kt`. This program should create a `Person`
   object and then print the value of that object's `age` property.

4. Compile and run the program. Check that it is calculating age correctly.
