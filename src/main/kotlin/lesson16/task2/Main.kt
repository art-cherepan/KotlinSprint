package lesson16.task2

import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle = Circle(radius = 42.0)

    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getArea()}")
}

class Circle(private val radius: Double) {
    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun getArea(): Double {
        return PI * radius.pow(2.0)
    }
}