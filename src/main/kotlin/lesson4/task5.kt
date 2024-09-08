package lesson4

fun main() {
    println("Наличие повреждений корпуса:")
    val isShipsHullDamageExist = readln().toBoolean()

    println("Текущий состав экипажа:")
    val crewComposition = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val numberOfSupplyCrates = readln().toInt()

    println("Благоприятность метеоусловий:")
    val isFavorableWeather = readln().toBoolean()

    val canSail =
        (!isShipsHullDamageExist &&
        crewComposition in MINIMAL_CREW_COMPOSITION_PERSON_NUMBER .. MAXIMAL_CREW_COMPOSITION_PERSON_NUMBER &&
        numberOfSupplyCrates > MINIMAL_SUPPLY_CRATES_NUMBER) ||
        (crewComposition == MAXIMAL_CREW_COMPOSITION_PERSON_NUMBER &&
        isFavorableWeather &&
        numberOfSupplyCrates >= MINIMAL_SUPPLY_CRATES_NUMBER)

    println("Корабль может отправиться в плавание: $canSail")
}

const val MINIMAL_CREW_COMPOSITION_PERSON_NUMBER = 55
const val MAXIMAL_CREW_COMPOSITION_PERSON_NUMBER = 70
const val MINIMAL_SUPPLY_CRATES_NUMBER = 50