package lesson6

fun main() {
    var counter = COUNT_OF_ATTEMPTS

    do {
        val firstNumber = (MIN_RANDOM_NUMBER .. MAX_RANDOM_NUMBER).random()
        val secondNumber = (MIN_RANDOM_NUMBER .. MAX_RANDOM_NUMBER).random()
        val sum = firstNumber + secondNumber

        println("Введите сумму $firstNumber и $secondNumber")
        val enterSum = readln().toInt()

        if (enterSum == sum) {
            println("Добро пожаловать!")
            break
        }

        counter--
    } while (counter > 0)

    if (counter == BOT_CHECKING_ATTEMPTS_COUNTER_FINISH) {
        println("Доступ запрещен")
    }
}

const val COUNT_OF_ATTEMPTS = 3
const val MIN_RANDOM_NUMBER = 1
const val MAX_RANDOM_NUMBER = 9
const val BOT_CHECKING_ATTEMPTS_COUNTER_FINISH = 0