package lesson12.task5

import kotlin.random.Random

fun main () {
    val measuredDays: MutableList<WeatherTask5> = mutableListOf()

    for (i in 0 .. NUMBER_OF_MEASURED_DAYS) {
        measuredDays.add(WeatherTask5(
            dayTimeTemperature = (10 .. 20).random(),
            nightTimeTemperature = (5 .. 15).random(),
            precipitationDuringDay = Random.nextBoolean(),
        ))
    }

    val dayTimeTemperatures: MutableList<Int> = mutableListOf()
    val nightTimeTemperatures: MutableList<Int> = mutableListOf()
    var precipitationsDuringDayCounter = 0

    measuredDays.forEach {
        dayTimeTemperatures.add(it.getDaytimeTemperature())
        nightTimeTemperatures.add(it.getNightTimeTemperature())

        if (it.isPrecipitationDuringDay()) {
            precipitationsDuringDayCounter++
        }
    }

    println("""
        Средняя дневная температура: ${dayTimeTemperatures.average().toInt()}
        Средняя ночная температура: ${nightTimeTemperatures.average().toInt()}
        Количество дней с осадками: $precipitationsDuringDayCounter
    """.trimIndent())
}

class WeatherTask5 (
    private val dayTimeTemperature: Int,
    private val nightTimeTemperature: Int,
    private val precipitationDuringDay: Boolean,
) {
    fun getDaytimeTemperature(): Int {
        return dayTimeTemperature
    }

    fun getNightTimeTemperature(): Int {
        return nightTimeTemperature
    }

    fun isPrecipitationDuringDay(): Boolean {
        return precipitationDuringDay
    }
}

const val NUMBER_OF_MEASURED_DAYS = 30