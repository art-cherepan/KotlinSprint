package lesson10

fun main() {
    val userLogin = readln()
    val userPassword = readln()

    if (!validateCredentials(credential = userLogin) || !validateCredentials(credential = userPassword)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateCredentials(credential: String): Boolean {
    return credential.length >= MINIMAL_CREDENTIALS_LENGTH
}

const val MINIMAL_CREDENTIALS_LENGTH = 4