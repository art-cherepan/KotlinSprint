package lesson5

fun main() {
    val randomValues = List(LOTTERY_NUMBERS_COUNT) {
        (RANDOM_LOTTERY_VALUE_FROM .. RANDOM_LOTTERY_VALUE_UNTIL).random()
    }
    val userValues = getUserValues()

    val intersectValues = randomValues.intersect(userValues.toSet())

    val result = when (intersectValues.size) {
        3 -> "Поздравляем, вы выйгралии джекпот!"
        2 -> "Поздравляем, вы выйграли крупный приз!"
        1 -> "Вы выйграли утешительный приз."
        else -> "Неудача."
    }

    println(result)
    println("Выйгрышные числа: $randomValues")
}

fun getUserValues(): List<Int>
{
    val resultList = mutableListOf<Int>()

    for (i in USER_INPUT_NUMBER_START .. USER_INPUT_NUMBER_END) {
        println("Введите $i число:")
        resultList.add(readln().toInt())
    }

    return resultList
}

const val RANDOM_LOTTERY_VALUE_FROM = 0
const val RANDOM_LOTTERY_VALUE_UNTIL = 42
const val LOTTERY_NUMBERS_COUNT = 3
const val USER_INPUT_NUMBER_START = 1
const val USER_INPUT_NUMBER_END = 3