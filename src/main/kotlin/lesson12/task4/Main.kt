package lesson12.task4

fun main() {
    WeatherTask4(
        daytimeTemperature = 10,
        nightTimeTemperature = 3,
        precipitationDuringDay = false,
    )
}

class WeatherTask4(
    daytimeTemperature: Int,
    nightTimeTemperature: Int,
    precipitationDuringDay: Boolean,
) {
    init {
        println("""
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTimeTemperature
            Наличие осадков: $precipitationDuringDay
        """.trimIndent())
    }
}