package lesson7

fun main() {
    var password = ""

    for (i in PASSWORD_START_INDEX .. PASSWORD_END_INDEX) {
        password += (PASSWORD_START_DIGIT_SYMBOL .. PASSWORD_END_DIGIT_SYMBOL).random()
        password += (PASSWORD_START_CHAR_SYMBOL .. PASSWORD_END_CHAR_SYMBOL).random()
    }

    println(password)
}

const val PASSWORD_START_INDEX = 0
const val PASSWORD_END_INDEX = 2
const val PASSWORD_START_DIGIT_SYMBOL = 0
const val PASSWORD_END_DIGIT_SYMBOL = 9
const val PASSWORD_START_CHAR_SYMBOL = 'a'
const val PASSWORD_END_CHAR_SYMBOL = 'z'