package lesson4

fun main() {
    val isSunnyWeather = true
    val isOpenAwning = true
    val airHumidity = 20
    val timeOfYear = "зима"

    val checkFavorableConditions = isFavorableConditions(
        isSunnyWeather,
        isOpenAwning,
        airHumidity,
        timeOfYear,
    )

    println("Благоприятные ли условия сейчас для роста бобовых? $checkFavorableConditions")
}

fun isFavorableConditions(
    isSunnyWeather: Boolean,
    isOpenAwning: Boolean,
    airHumidity: Int,
    timeOfYear: String,
): Boolean {
    val favorableTimesOfYear = setOf("весна", "лето", "осень")

    return isSunnyWeather
            && isOpenAwning
            && airHumidity == FAVORABLE_AIR_HUMIDITY
            && favorableTimesOfYear.contains(timeOfYear)
}

const val FAVORABLE_AIR_HUMIDITY = 20