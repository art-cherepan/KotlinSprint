package lesson14.task3

import kotlin.math.PI

fun main() {
    val figureList: List<Figure> = listOf(
        Rectangle(
            color = "Белый",
            length = 100.2,
            width = 50.4,
        ),
        Rectangle(
            color = "Черный",
            length = 110.8,
            width = 43.3,
        ),
        Round(
            color = "Белый",
            radius = 21.21,
        ),
        Round(
            color = "Черный",
            radius = 19.19,
        )
    )

    var blackFigureSum = 0.0
    var whiteFigureSum = 0.0

    figureList.forEach {
        if (it.color == "Белый") {
            whiteFigureSum += it.calculateArea()
        }

        if (it.color == "Черный") {
            blackFigureSum += it.calculatePerimeter()
        }
    }

    println(
        """
            Сумма площадей всех белых фигур: $whiteFigureSum
            Сумма периметров всех черных фигур: $blackFigureSum
        """.trimIndent()
    )
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Round(
    private val radius: Double,
    color: String,
) : Figure(
    color,
) {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    private val length: Double,
    private val width: Double,
    color: String,
) : Figure(
    color,
) {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculatePerimeter(): Double {
        return length * 2 + width * 2
    }
}