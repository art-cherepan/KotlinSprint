package lesson18.task4

import kotlin.math.pow

fun main() {
    val packages: List<Box> = listOf(
        RectangleBox(
            length = 20.0,
            width = 14.0,
            height = 10.3,
        ),
        CubeBox(
            ribLength = 10.0,
        )
    )

    packages.forEach { println("Площадь поверхности посылки: ${it.calculateSurfaceArea()}") }
}


open class Box {
    open fun calculateSurfaceArea() = 0.0
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    override fun calculateSurfaceArea(): Double = length * width * height
}

class CubeBox(
    private val ribLength: Double,
) : Box() {
    override fun calculateSurfaceArea(): Double = ribLength.pow(3.0)
}