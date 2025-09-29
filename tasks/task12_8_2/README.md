# Task 12.8.2

An Amper project for the playing cards task. Source code can be found in
the `src` subdirectory.

`Suit.kt` contains the enum class for playing card suits that is discussed
in the notes.

You need to implement a comparable enum class for playing card ranks, in
the file `Rank.kt`, following the guidance in the notes.

After that, edit `Card.kt` and define a `Card` class there. This class
should have a property named `rank`, of type `Rank`, and a property named
`suit`, of type `Suit`.

The `Card` class will also need a computed property named `fullName` and
an overridden `toString()` method - see the notes for more details on those.

Finally, write a program in `Main.kt` that

* Creates a mutable list of `Card` objects, to represent a deck of cards
* Populates that list with a full set of 52 standard playing cards
* Shuffles the deck randomly
* Prints the full name of each card in the shuffled deck
