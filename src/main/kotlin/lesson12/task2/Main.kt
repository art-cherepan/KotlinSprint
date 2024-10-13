package lesson12.task2

fun main () {
    val newWeather = NewWeather(
        daytimeTemperature = 10,
        nightTimeTemperature = 6,
        precipitationDuringDay = false,
    )

    newWeather.printWeatherData()
}

class NewWeather (
    private var daytimeTemperature: Int,
    private var nightTimeTemperature: Int,
    private var precipitationDuringDay: Boolean,
) {
    fun printWeatherData() {
        println("""
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTimeTemperature
            Наличие осадков: $precipitationDuringDay
        """.trimIndent())
    }
}