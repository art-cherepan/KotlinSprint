package lesson10

fun main() {
    val userLogin = getUserLogin()
    val userPassword = getUserPassword()

    validateCredentials(userLogin = userLogin, userPassword = userPassword)
}

fun getUserLogin(): String = readln()

fun getUserPassword(): String = readln()

fun validateCredentials(userLogin: String, userPassword: String) {
    if (userLogin.length < MINIMAL_CREDENTIALS_LENGTH || userPassword.length < MINIMAL_CREDENTIALS_LENGTH) {
        println("Логин или пароль недостаточно длинные")
    }
}

const val MINIMAL_CREDENTIALS_LENGTH = 4