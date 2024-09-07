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
        crewComposition in 55 .. 70 &&
        numberOfSupplyCrates > 50) ||
        (crewComposition == 70 &&
        isFavorableWeather &&
        numberOfSupplyCrates >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}