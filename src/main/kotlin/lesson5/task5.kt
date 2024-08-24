package lesson5

import kotlin.random.Random

fun main() {
    val randomValues = List(3) { Random.nextInt(0, 5) }
    val userValues = getUserValues()

    val intersectValues = randomValues.intersect(userValues.toSet())

    val result = when (intersectValues.size) {
        3 -> "Поздравляем, вы выйгралии джекпот!"
        2 -> "Поздравляем, вы выйграли крупный приз!"
        1 -> "Вы выйграли утешительный приз."
        else -> "Неудача."
    }

    println(result)
}

fun getUserValues(): List<Int>
{
    val resultList = mutableListOf<Int>()

    for (i in 1 .. 3) {
        println("Введите $i число:")
        resultList.add(readln().toInt())
    }

    return resultList
}