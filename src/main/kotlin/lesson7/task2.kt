package lesson7

fun main() {
    for (i in COUNT_OF_ATTEMPTS_START .. COUNT_OF_ATTEMPTS_END) {
        val authCode = (1000 .. 9999).random()

        println("Ваш код авторизации: $authCode")
        println("Введите код авторизации:")

        val enterCode = readln().toInt()

        if (enterCode == authCode) {
            println("Добро пожаловать!")

            return
        }
    }
}

const val COUNT_OF_ATTEMPTS_START = 1
const val COUNT_OF_ATTEMPTS_END = 2