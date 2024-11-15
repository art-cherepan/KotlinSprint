package lesson16.task3

fun main() {
    val user = User("Андрей")
    val validPassword = user.validatePassword("aaZZ11dC")

    if (validPassword) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}

class User(private val login: String){
    private var password: String? = null

    init {
        password = generatePassword()
    }

    fun getLogin(): String {
        return login
    }

    fun getPassword(): String? {
        return password
    }

    fun validatePassword(_password: String): Boolean {
        return _password == password
    }

    private fun generatePassword(): String {
        val passwordLength = 6
        val startIndex = 1
        val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        var password = ""

        for (i in startIndex..passwordLength) {
            password += allChars.random()
        }

        return password
    }
}