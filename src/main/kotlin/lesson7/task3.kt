package lesson7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()

    val range: IntProgression = START_RANGE_NUMBER .. userNumber step 2

    for (number in range) {
        println(number)
    }
}

const val START_RANGE_NUMBER = 0