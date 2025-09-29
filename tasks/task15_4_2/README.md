# Task 15.4.2

This is an Amper project, containing Version 2 of the graphics application
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

This improves on Version 1 by exploiting polymorphism.

Look at the `Shape` class first. Notice that it now has a `draw()` method,
declared as `open` for overriding, but that the method body is empty. This
method has no meaningful  implementation. It exists solely to be overridden
by subclasses, thus enabling **dynamic binding** to take place.

Next, look at the new implementation of `draw()` in `Picture`. Compare it
with the implementation in Version 1. This new version exploits polymorphism,
and is much more maintainable. It won't need to be changed if a new kind of
shape is added to the application.

To prove this, edit `Main.kt` and uncomment the line that adds a `Triangle`
object to the picture. Rebuild and rerun the application. You should now see
a red triangle.

**No changes were needed to the `Picture` class in order for this to happen.**
The shape drawing code in `Picture` will work for any class we write, so long
as that class inherits from `Shape` and overrides `draw()`.
