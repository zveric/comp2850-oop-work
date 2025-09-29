# Task 12.5.2

1. Edit `Getter.kt`. Modify the definition of `Person` to look like this:

   ```kotlin
   class Person(_name: String, val birth: LocalDate) {

      var isMarried = false

      var name = _name
          get() {
              return field.uppercase()
          }
   }
   ```

2. Add a `main()` function that creates a `Person` object and then prints
   that person's name.

3. Compile and run the program. You should see the name printed in uppercase.
