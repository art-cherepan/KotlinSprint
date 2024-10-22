package lesson14.task2

fun main() {
    val liner = LinerTask2()
    liner.getShipInfo()

    val cargo = CargoTask2()
    cargo.getShipInfo()

    val icebreaker = IcebreakerTask2()
    icebreaker.getShipInfo()
}

open class LinerTask2 (
    val speed: Int = 100,
    val liftingCapacity: Int = 20,
    val passengerCapacity: Int = 1000,
    val toCrashIce: Boolean = false,
) {
    open fun getShipName(): String {
        return "Лайнер"
    }

    open fun getLoadingMethod(): String {
        return "Выдвигает горизонтальный трап со шкафута"
    }

    fun getShipInfo() {
        val crashIce = if (toCrashIce) {
            "да"
        } else {
            "нет"
        }

        println(
            """
                Корабль: ${getShipName()}
                Скорость: $speed
                Грузоподъемность: $liftingCapacity
                Пассажировместимость: $passengerCapacity
                Способность колоть лёд: $crashIce
                Способ погрузки: ${getLoadingMethod()}
                """.trimIndent()
        )
    }
}

class CargoTask2(
    speed: Int = 80,
    liftingCapacity: Int = 50,
    passengerCapacity: Int = 700,
): LinerTask2(
    speed,
    liftingCapacity,
    passengerCapacity,
) {
    override fun getShipName(): String {
        return "Грузовой корабль"
    }

    override fun getLoadingMethod(): String {
        return "Активирует погрузочный кран"
    }
}

class IcebreakerTask2(
    speed: Int = 70,
    liftingCapacity: Int = 30,
    passengerCapacity: Int = 300,
    toCrashIce: Boolean = true,
) : LinerTask2(
    speed,
    liftingCapacity,
    passengerCapacity,
    toCrashIce,
) {
    override fun getShipName(): String {
        return "Ледокол"
    }

    override fun getLoadingMethod(): String {
        return "Открывает ворота со стороны кормы"
    }
}