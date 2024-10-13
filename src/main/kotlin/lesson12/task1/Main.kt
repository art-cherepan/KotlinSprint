package lesson12.task1

fun main () {
    val weather1 = Weather()
    weather1.printWeatherData()

    val weather2 = Weather()
    weather2.printWeatherData()

    weather1.daytimeTemperature = 20
    weather1.nightTimeTemperature = 10
    weather1.precipitationDuringDay = true
    weather1.printWeatherData()

    weather2.daytimeTemperature = 17
    weather2.nightTimeTemperature = 8
    weather2.printWeatherData()
}

class Weather() {
    var daytimeTemperature = 15
    var nightTimeTemperature = 5
    var precipitationDuringDay = false

    fun printWeatherData() {
        println("""
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTimeTemperature
            Наличие осадков: $precipitationDuringDay
        """.trimIndent())
    }
}