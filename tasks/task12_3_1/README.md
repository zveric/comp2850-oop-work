# Task 12.3.1

1. Edit the file `Construct.kt`. Try compiling and running the code.

2. Change `main()` so that it attempts to create the `Point` object without
   specifying values for `x` and `y`. Try compiling the code. What errors
   do you see?

3. Modify the class definition so that it includes the secondary constructor
   described in the notes. Compile and run the program to verify that this
   fixes the issue.

4. Now change the first line of `main()` to be

   ```kotlin
   val p = Point(4, 7)
   ```

   Try recompiling the code. What happens?

5. Add another secondary constructor to `Point` that fixes the issue.
