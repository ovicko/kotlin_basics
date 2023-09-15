import kotlin.math.PI
import kotlin.math.pow

fun main() {
   var area =  calculateArea(Shape.Square(4F))
    println(area)
}

sealed class Shape {
    class Square(val length: Float):Shape();
    class Rectangle(val length: Int, val breadth: Int): Shape();
    class Circle(val radius: Float): Shape();
}

fun calculateArea(shape: Shape): Number = when(shape) {
    is Shape.Circle->shape.radius.pow(2)* PI
    is Shape.Rectangle -> shape.length*shape.breadth
    is Shape.Square -> shape.length.pow(2)
}
