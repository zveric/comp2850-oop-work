# Task 17.5

This is an Amper project, containing Version 4 of the graphics application
case study.

**NOTE: you will need to run this code on your own PC or on SoCS Linux
machines. You will not be able to try it out in a Codespace!**

The application uses Java's Swing UI framework and displays a canvas on
which a collection of graphic elements are drawn.

To build & run the application, do

    ./amper run

Omit the `./` if using `cmd.exe` on Windows; invoke Amper with `.\amper.bat`
if using Windows Powershell.

## Discussion of Source Code

This final version of the application has the ability to draw images as well
as shapes.

As in Version 3, circles, rectangles and other shapes are represented as
subclasses of an abstract `Shape` class.

Images, however, are represented differently. If you look at `Image.kt`,
you can see that the `Image` class inherits from a *different* class,
`Bitmap`. This class isn't part of the the application itself, but is
provided as a separate software library.

Given that the shape classes and the image class belong to different class
hierarchies, the only way of drawing both shapes *and* images polymorphically
is to have the shape classes and the image class implement a common interface,
`Drawable`. You can see this implemented in `Drawable.kt`. It specifies a
single method, `draw()`. If you look at `Shape.kt`, you'll see that the
`Shape` class no longer specifies this `draw()` method, but the class remains
abstract to prevent creation of `Shape` objects.

The `Picture` class also changes in this new version of the application.
It now represents a picture as a list of instances of classes that implement
`Drawable`, rather than a list of instances of classes that inherit from
`Shape`. This allows it to store images as well as shapes.
