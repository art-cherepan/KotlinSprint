package lesson18.task4

import kotlin.math.pow

fun main() {
    val packages: List<Box> = listOf(
        RectangleBox(
            length = 18.3,
            width = 12.0,
            height = 7.4,
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
    override fun calculateSurfaceArea(): Double = (width * height) * 2 + (length * height) * 2 + (width * length) * 2
}

class CubeBox(
    private val ribLength: Double,
) : Box() {
    override fun calculateSurfaceArea(): Double = ribLength.pow(2.0) * CUBE_RIB_COUNT
}

const val CUBE_RIB_COUNT = 6