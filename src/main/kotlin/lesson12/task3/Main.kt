package lesson12.task3

fun main() {
    val newNewWeather = WeatherTask3(290, 280, true)
    newNewWeather.printWeatherData()
}

class WeatherTask3(
    daytimeTemperature: Int,
    nightTimeTemperature: Int,
    private val precipitationDuringDay: Boolean,
) {
    private val daytimeTemperature = (daytimeTemperature - TRIPLE_POINT_TEMPERATURE_OF_WATER).toInt()
    private val nightTimeTemperature = (nightTimeTemperature - TRIPLE_POINT_TEMPERATURE_OF_WATER).toInt()

    fun printWeatherData() {
        println("""
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTimeTemperature
            Наличие осадков: $precipitationDuringDay
        """.trimIndent())
    }
}

const val TRIPLE_POINT_TEMPERATURE_OF_WATER = 273.15