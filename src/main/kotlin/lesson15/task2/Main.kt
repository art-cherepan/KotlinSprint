package lesson15.task2

fun main() {
    val temperature = Temperature(23.4)
    val precipitationAmount = PrecipitationAmount(3.5)

    val weatherServer = WeatherServer()

    println(weatherServer.sendMessage(temperature))
    println(weatherServer.sendMessage(precipitationAmount))
}

class WeatherData(
    val name: String,
    val value: Double,
)

abstract class WeatherStationStats(
    val value: Double,
) {
    abstract fun getData(): WeatherData
}

class Temperature(value: Double) : WeatherStationStats(value) {
    override fun getData(): WeatherData {
        return WeatherData(
            name = "Температура",
            value = value,
        )
    }
}

class PrecipitationAmount(value: Double) : WeatherStationStats(value) {
    override fun getData(): WeatherData {
        return WeatherData(
            name = "Количество осадков",
            value = value,
        )
    }
}

class WeatherServer {
    fun sendMessage(weatherStationStats: WeatherStationStats): String {
        return when (weatherStationStats) {
            is Temperature -> "${weatherStationStats.getData().name}: ${weatherStationStats.getData().value} °C"
            is PrecipitationAmount -> "${weatherStationStats.getData().name}: ${weatherStationStats.getData().value} мм"
            else -> "Неопределенный тип"
        }
    }
}