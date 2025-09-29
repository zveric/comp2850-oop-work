# Task 15.2.1

1. Add the following code to `Subclasses.kt`:

   ```kotlin
   open class Parent

   class Child : Parent()
   ```

   Try compiling the file. This should work, producing bytecode files named
   `Parent.class` and `Child.class`.

2. Add this code to the file:

   ```kotlin
   class GrandChild : Child()
   ```

   Try recompiling the file. Take note of the compiler error message.

3. Fix the problem and then verify that the file compiles successfully. 
