package lesson6

fun main() {
    val randomNumber = (START_RANDOM_NUMBER .. FINISH_RANDOM_NUMBER).random()
    var counter = NUMBER_OF_ATTEMPTS

    while (counter > 0) {
        println("Введите число:")
        val enterNumber = readln().toInt()

        if (enterNumber == randomNumber) {
            println("Это была великолепная игра!")

            return
        }

        counter--
        println("Неверно. Осталось попыток: $counter")
    }

    println("Было загадано число $randomNumber")
}

const val NUMBER_OF_ATTEMPTS = 5
const val START_RANDOM_NUMBER = 1
const val FINISH_RANDOM_NUMBER = 9