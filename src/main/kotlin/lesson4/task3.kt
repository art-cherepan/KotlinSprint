package lesson4

fun main() {
    val isSunnyWeather = true
    val isOpenAwning = true
    val airHumidity = 20
    val timeOfYear = "зима"

    val isFavorableConditions =
        (isSunnyWeather == IS_SUNNY_WEATHER) &&
        (isOpenAwning == IS_OPEN_AWNING) &&
        (airHumidity == AIR_HUMIDITY) &&
        (timeOfYear != TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}

const val AIR_HUMIDITY = 20
const val IS_SUNNY_WEATHER = true
const val IS_OPEN_AWNING = true
const val TIME_OF_YEAR = "зима"