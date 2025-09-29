# Task 4.3

Put your solution in a file `ModuleGrade.kt` in this directory.

Your program should

* Check that three command line arguments have been supplied, terminating
  the program with a suitable error if this is not the case

* Determine the rounded average of the three marks suppled on the command
  line (use `roundToInt()`, from `kotlin.math`, to help with this)

* Determine a module grade from the rounded average, following these rules:

  - Average between 70 and 100 is a Distinction
  - Average between 40 and 69 is a Pass
  - Average between 0 and 39 is a Fail

  Use the `when` expression from the notes to implement this!
