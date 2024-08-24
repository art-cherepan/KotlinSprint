package lesson5

import kotlin.random.Random

fun main() {
    val firstNumber = Random.nextInt(RANDOM_NUMBER_FROM, RANDOM_NUMBER_UNTIL)
    val secondNumber = Random.nextInt(RANDOM_NUMBER_FROM, RANDOM_NUMBER_UNTIL)
    val sum = firstNumber + secondNumber

    println("Чтобы подтвердит, что вы не бот, пожалуйста, введите сумму $firstNumber и $secondNumber:")
    val userInput = readln().toInt()

    if (userInput == sum) {
        println("Поздравляю, вы не бот.")
    } else {
        println("Очевидно, вы бот.")
    }
}

const val RANDOM_NUMBER_FROM = 0
const val RANDOM_NUMBER_UNTIL = 10