package lesson5

fun main() {
    println("Введите 1 число:")
    val firstNumber = readln().toInt()

    println("Введите 2 число:")
    val secondNumber = readln().toInt()

    if ((firstNumber == FIRST_LUCKY_NUMBER && secondNumber == SECOND_LUCKY_NUMBER) ||
        (firstNumber == SECOND_LUCKY_NUMBER && secondNumber == FIRST_LUCKY_NUMBER)) {
            println("Поздравляем! Вы выиграли главный приз!")
    } else if (
            firstNumber == FIRST_LUCKY_NUMBER ||
            firstNumber == SECOND_LUCKY_NUMBER ||
            secondNumber == FIRST_LUCKY_NUMBER ||
            secondNumber == SECOND_LUCKY_NUMBER
        ) {
            println("Вы выиграли утешительный приз!")
        } else {
            println("Неудача!")
        }

    println("Для победы нужно было отгадать числа $FIRST_LUCKY_NUMBER и $SECOND_LUCKY_NUMBER")
}

const val FIRST_LUCKY_NUMBER = 21
const val SECOND_LUCKY_NUMBER = 21