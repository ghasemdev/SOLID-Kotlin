class Circle : Shape {
    override fun draw() = "draw Circle"
}

class Rectangle : Shape {
    override fun draw() = "draw Rectangle"
}

class DrawShape(private val shapes: List<Shape>) {
    fun drawShapes() {
        for (shape in shapes) {
            /*println(
                // This is wrong because not open for developing and close for editing
                if (shape is Circle) "draw Circle"
                else "draw Rectangle"
            )*/
            println(shape.draw())
        }
    }
}

//---------------------------------------------------------------------------

interface Shape {
    fun draw(): String
}

fun main() {
    val drawShape = DrawShape(listOf(Circle(), Circle(), Rectangle()))
    drawShape.drawShapes()
}