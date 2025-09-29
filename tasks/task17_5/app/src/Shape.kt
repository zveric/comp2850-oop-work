// Task 17.5

import java.awt.Color

abstract class Shape(val x: Int, val y: Int, val color: Color)

// Shape remains abstract to prevent instantation but no longer has an
// abstract draw() method (this is now specified in the Drawable interface)
