package lesson5

fun main() {
    val firstNumber = (RANDOM_NUMBER_FROM..RANDOM_NUMBER_UNTIL).random()
    val secondNumber = (RANDOM_NUMBER_FROM..RANDOM_NUMBER_UNTIL).random()
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