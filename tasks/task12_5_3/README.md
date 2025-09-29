# Task 12.5.3

1. Edit `Setter.kt`. Modify the definition of `Person` to look like this:

   ```kotlin
   class Person(_name: String, val birth: LocalDate) {

      var isMarried = false

      var name = _name
          set(value) {
              require(value.isNotBlank()) { "Name cannot be blank" }
              field = value
          }
   }
   ```

2. Add a `main()` function that creates a `Person` object and then attempts
   to assign an empty string to its `name` property.

3. Compile and run the program. It should crash with an
   `IllegalArgumentException`.
