package lesson4

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л " +
            "соответствует категории 'Average': ${checkCargoIsAverage(firstCargoWeight, firstCargoVolume)}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л " +
            "соответствует категории 'Average': ${checkCargoIsAverage(secondCargoWeight, secondCargoVolume)}")
}

fun checkCargoIsAverage(weight: Int, volume: Int): Boolean  {
    return (weight in (CUSTOMS_AVERAGE_WEIGHT_MIN + 1)..CUSTOMS_AVERAGE_WEIGHT_MAX)
            && (volume < CUSTOMS_AVERAGE_VOLUME_MAX)
}

const val CUSTOMS_AVERAGE_WEIGHT_MIN = 35
const val CUSTOMS_AVERAGE_WEIGHT_MAX = 100
const val CUSTOMS_AVERAGE_VOLUME_MAX = 100
