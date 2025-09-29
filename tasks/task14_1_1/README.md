# Task 14.1.1

1. Examine the file `Customer.kt`. This doesn't have an explicit package
   declaration. The class defined in the file will be treated as if it were
   part of an unnamed 'default package'.

2. In a terminal window, compile the code using the command-line compiler:

       kotlinc Customer.kt

   Verify that this has created a bytecode file named `Customer.class`,
   in the same directory as `Customer.kt`. Then remove this bytecode file.

3. Edit `Customer.kt` and add this line to the start of the file:

   ```kotlin
   package myapp.orders
   ```

   Invoke the compiler again. Where is `Customer.class` now?
