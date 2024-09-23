package lesson10

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()

    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword(passwordLength: Int): String {
    val specSymbols = ' ' .. '/'
    val digits = 0 .. 9

    val startIndex = 0
    var strPasswordResult = ""

    for (counter in startIndex .. passwordLength) {
        if (counter % EVEN_CHECK == 0) {
            strPasswordResult += digits.random()
        } else {
            strPasswordResult += specSymbols.random()
        }
    }

    return strPasswordResult
}

const val EVEN_CHECK = 2