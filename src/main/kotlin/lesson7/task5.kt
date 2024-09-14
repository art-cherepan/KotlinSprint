package lesson7

fun main() {
    println("Введите длину пароля, минимум 6 символов:")
    val passwordLength = readln().toInt()
    var password: String

    do {
        password = ""

        for (i in START_INDEX..passwordLength) {
            val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
            password += allChars.random()
        }

        var checkDigit = false
        var checkLowerCase = false
        var checkUpperCase = false

        for (symbol in password) {
            if (symbol.isDigit()) {
                checkDigit = true
                continue
            }

            if (symbol.isLowerCase()) {
                checkLowerCase = true
                continue
            }

            if (symbol.isUpperCase()) {
                checkUpperCase = true
                continue
            }
        }
    } while (!checkDigit || !checkLowerCase || !checkUpperCase)

    println("Пароль: $password")
}

const val START_INDEX = 1