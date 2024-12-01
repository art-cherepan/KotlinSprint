package lesson18.task5

fun main() {
    val screen = Screen()

    screen.draw(1,2)
    screen.draw(1.3.toFloat(), 2.4.toFloat())
    screen.draw(10, 20)
    screen.draw(10.3.toFloat(), 21.1.toFloat())
    screen.draw(11, 21, 4)
    screen.draw(11.3.toFloat(), 22.4.toFloat(), 7)
}

class Screen {
    fun draw(x: Int, y: Int, sideLength: Float) {
        println("Нарисован квадрат с координатами $x и $y и длиной стороны $sideLength")
    }

    fun draw(x: Float, y: Float, sideLength: Float) {
        println("Нарисован квадрат с координатами ${x.toInt()} и ${y.toInt()} и длиной стороны $sideLength")
    }

    fun draw(x: Int, y: Int, radius: Int) {
        println("Нарисован круг с координатами $x и $y и радиусом $radius")
    }

    fun draw(x: Float, y: Float, radius: Int) {
        println("Нарисован круг с координатами ${x.toFloat()} и ${y.toFloat()} и радиусом $radius")
    }

    fun draw(x: Int, y: Int) {
        println("Нарисована точка с координатами $x и $y")
    }

    fun draw(x: Float, y: Float) {
        println("Нарисована точка с координатами ${x.toInt()} и ${y.toInt()}")
    }
}