package lesson18.task5

fun main() {
    val screen = Screen()

    screen.drawDot(1,2)
    screen.drawDot(1.3.toFloat(), 2.4.toFloat())
    screen.drawSquare(10, 20, 7)
    screen.drawSquare(10.3.toFloat(), 21.1.toFloat(), 8)
    screen.drawCircle(11, 21, 4)
    screen.drawCircle(11.3.toFloat(), 22.4.toFloat(), 7)
}

class Screen {
    fun drawSquare(x: Int, y: Int, sideLength: Int) {
        println("Нарисован квадрат с координатами $x и $y и длиной стороны $sideLength")
    }

    fun drawSquare(x: Float, y: Float, sideLength: Int) {
        println("Нарисован квадрат с координатами ${x.toInt()} и ${y.toInt()} и длиной стороны $sideLength")
    }

    fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Нарисован круг с координатами $x и $y и радиусом $radius")
    }

    fun drawCircle(x: Float, y: Float, radius: Int) {
        println("Нарисован круг с координатами ${x.toFloat()} и ${y.toFloat()} и радиусом $radius")
    }

    fun drawDot(x: Int, y: Int) {
        println("Нарисована точка с координатами $x и $y")
    }

    fun drawDot(x: Float, y: Float) {
        println("Нарисована точка с координатами ${x.toInt()} и ${y.toInt()}")
    }
}