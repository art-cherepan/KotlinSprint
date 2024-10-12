package lesson12.task3

fun main() {
    val newNewWeather = NewNewWeather(290, 280, true)
    newNewWeather.printWeatherData()
}

class NewNewWeather() {
    private var daytimeTemperature = 10
    private var nightTimeTemperature = 5
    private var precipitationDuringDay = false

    constructor(
        daytimeTemperature: Int,
        nightTimeTemperature: Int,
        precipitationDuringDay: Boolean,
    ) : this() {
        this.daytimeTemperature = (daytimeTemperature - TRIPLE_POINT_TEMPERATURE_OF_WATER).toInt()
        this.nightTimeTemperature = (nightTimeTemperature - TRIPLE_POINT_TEMPERATURE_OF_WATER).toInt()
        this.precipitationDuringDay = precipitationDuringDay
    }

    fun printWeatherData() {
        println("""
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTimeTemperature
            Наличие осадков: $precipitationDuringDay
        """.trimIndent())
    }
}

const val TRIPLE_POINT_TEMPERATURE_OF_WATER = 273.15