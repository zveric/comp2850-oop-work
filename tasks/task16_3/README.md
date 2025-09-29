# Task 16.3

This is an Amper project, containing Version 3 of the graphics application
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

The only difference between this version and Version 2 is that `Shape` is
now an **abstract class**, with an abstract `draw()` method.

If you build and run the application, you should see the same picture as
for Version 2.

However, if you attempt to create an actual `Shape` object and add it to the
picture, this will now be a compiler error. You are not allowed to create
instances of an abstract class.
