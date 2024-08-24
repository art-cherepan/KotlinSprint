package lesson5

fun main() {
    println("Введите 1 число:")
    val firstUserNumber = readln().toInt()

    println("Введите 2 число:")
    val secondUserNumber = readln().toInt()

    checkLucky(firstUserNumber, secondUserNumber)
}

fun checkLucky(firstNumber: Int, secondNumber: Int) {
    if (firstNumber == FIRST_LUCKY_NUMBER || firstNumber == SECOND_LUCKY_NUMBER) {
        if ((firstNumber != secondNumber) && (secondNumber == FIRST_LUCKY_NUMBER) || (secondNumber == SECOND_LUCKY_NUMBER)) {
            println("Поздравляем! Вы выиграли главный приз!")
        } else {
            println("Вы выиграли утешительный приз!")
        }
    } else if (secondNumber == FIRST_LUCKY_NUMBER || secondNumber == SECOND_LUCKY_NUMBER) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Для победы нужно было отгадать числа $FIRST_LUCKY_NUMBER и $SECOND_LUCKY_NUMBER")
}

const val FIRST_LUCKY_NUMBER = 8
const val SECOND_LUCKY_NUMBER = 21